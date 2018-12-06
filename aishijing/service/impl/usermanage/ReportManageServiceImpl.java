package com.chuange.aishijing.service.impl.usermanage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.VedioReportDao;
import com.chuange.aishijing.dto.ReportDTO;
import com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager;
import com.chuange.aishijing.service.VedioReportService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
import com.mysql.jdbc.StringUtils;
/**
 * 
 * @author yuany
 *	举报管理
 */
@Service
@Transactional
public class ReportManageServiceImpl implements VedioReportService{
	@Autowired
	private VedioReportDao vedioReportDao;
	
	@Override
	public UsersVO queryAllBycondition(Integer pagesize, Integer currentPage, ReportDTO report,String category) {
		// TODO Auto-generated method stub
		Sort sort = new Sort(Sort.Direction.DESC,"id");
		Pageable pageable =PageRequest.of(currentPage - 1,pagesize,sort);
		Page<VideoAndCommentReportManager> pages=vedioReportDao.findAll(new Specification<VideoAndCommentReportManager>() {

			@Override
			public Predicate toPredicate(Root<VideoAndCommentReportManager> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(report != null) {
					if(!StringUtils.isNullOrEmpty(report.getUsername())) {
						list.add(criteriaBuilder.like(root.get("reportedName").as(String.class), "%" + report.getUsername() + "%"));
					}
					if(report.getReporttime()!=null) {
						list.add(criteriaBuilder.equal(root.get("reportTime").as(Date.class), report.getReporttime()));
					}
					if(!StringUtils.isNullOrEmpty(report.getSealstatus())) {
						list.add(criteriaBuilder.equal(root.get("processStatus").as(String.class), report.getSealstatus()));
					}
					if(!StringUtils.isNullOrEmpty(report.getReporttype())) {
						list.add(criteriaBuilder.equal(root.get("reportType").as(String.class), report.getReporttype()));
					}
				}
				list.add(criteriaBuilder.equal(root.get("reportCategory").as(String.class), category));
	            Predicate[] p = new Predicate[list.size()];
	            return criteriaBuilder.and(list.toArray(p));
			}
			
		},pageable);
		UsersVO users=new UsersVO();
		users.success("success", new MD5(users.toString()).compute(),pages);
		return users;
	}

	@Override
	public void modifyById(VideoAndCommentReportManager manager) {
		// TODO Auto-generated method stub
		vedioReportDao.update(manager.getId(), manager.getProcessStatus(), manager.getProcessResult());
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		vedioReportDao.deleteById(id);
	}

}

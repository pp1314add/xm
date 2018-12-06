package com.chuange.aishijing.service.impl.usermanage;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.ReportDao;
import com.chuange.aishijing.pojo.userManage.UserReport;
import com.chuange.aishijing.service.ReportService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
/**
 * 
 * @author yuany
 * 举报
 *
 */
@Service
@Transactional
public class ReportServiceImpl implements ReportService{
	@Autowired
	private ReportDao reportDao;
	@Override
	public UsersVO queryReport(Integer pagesize, Integer currentPage, String id) {
		Sort sort = new Sort(Sort.Direction.DESC,"id");
		@SuppressWarnings("deprecation")
		Pageable pageable =new PageRequest(currentPage - 1,pagesize,sort);
		Page<UserReport> list=reportDao.findAllByUserId(pageable,id);
		UsersVO uservo=new UsersVO();
		uservo.success("success", new MD5(uservo.toString()).compute(), list);
		return uservo;
	}

}

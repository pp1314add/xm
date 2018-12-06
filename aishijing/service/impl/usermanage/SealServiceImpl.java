package com.chuange.aishijing.service.impl.usermanage;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.SealDao;
import com.chuange.aishijing.pojo.userManage.UserSealInformationLog;
import com.chuange.aishijing.service.SealService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
@Service
@Transactional
public class SealServiceImpl implements SealService{
	@Autowired
	private SealDao sealDao;
	/**
	 * 查询
	 */
	@Override
	public UsersVO querySeal(Integer pagesize, Integer currentPage, String id) {
		Pageable pageable=PageRequest.of(currentPage, pagesize);
		UsersVO vo=new UsersVO();
		// TODO Auto-generated method stub
		vo.success("success", new MD5(vo.toString()).compute(),sealDao.findAllByUserid(pageable, id));
		return vo;
	}
	/**
	 * 插入
	 */
	@Override
	public UsersVO insertSeal(UserSealInformationLog log) {
		// TODO Auto-generated method stub
		
		UsersVO vo=new UsersVO();
		vo.success("success", new MD5(vo.toString()).compute(), sealDao.save(log));
		return vo;
	}

}

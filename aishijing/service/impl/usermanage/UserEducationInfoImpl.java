package com.chuange.aishijing.service.impl.usermanage;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.EducationDao;
import com.chuange.aishijing.service.UserEducationService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
/**
 * 
 * @author yuany
 * 教育背景
 *
 */
@Service
@Transactional
public class UserEducationInfoImpl implements UserEducationService{
	@Autowired
	private EducationDao educationDao;
	@Override
	public UsersVO queryEducationInfo(String id) {
		// TODO Auto-generated method stub
		UsersVO vo=new UsersVO();
		vo.success("success", new MD5(vo.toString()).compute(), educationDao.findByUserid(id));
		return vo;
	}

}

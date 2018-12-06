package com.chuange.aishijing.service.impl.usermanage;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.SealInfoDao;
import com.chuange.aishijing.pojo.userManage.UserSealInformation;
import com.chuange.aishijing.service.SealInfoService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
/**
 * 
 * @author yuany
 * 封号信息
 *
 */
@Service
@Transactional
public class SealInfoServiceImpl implements SealInfoService{
	@Autowired
	private SealInfoDao sealInfoDao;
	@Override
	public UsersVO querySealInfoByUserId(String id) {
		// TODO Auto-generated method stub
		UsersVO seal=new UsersVO();
		seal.success("success", new MD5(seal.toString()).compute(), sealInfoDao.findByUserId(id));
		return seal;
	}

	@Override
	public UsersVO UpdateSealInfo(UserSealInformation seal) {
		// TODO Auto-generated method stub
		UsersVO user=new UsersVO();
		user.success("success", new MD5(user.toString()).compute(), sealInfoDao.saveAndFlush(seal));
		return user;
		
	}

}

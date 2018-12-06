package com.chuange.aishijing.service.impl.LoginUser;


import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author yuany
 * index service
 *
 */

import com.chuange.aishijing.dao.loginuser.IndexDao;
import com.chuange.aishijing.service.IndexService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.index.TreeResponseVO;
@Service
@Transactional
public class IndexServiceImpl implements IndexService{
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	@Autowired
	private IndexDao indexDao;
	@Override
	public TreeResponseVO queryTreeListByType(String resourceType) {
		// TODO Auto-generated method stub
		TreeResponseVO treeResponseVO=new TreeResponseVO();
		treeResponseVO.success("success", new MD5(treeResponseVO.toString()).compute(),indexDao.findAllByResourceType(resourceType));
		return treeResponseVO;
	}
	
}

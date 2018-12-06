package com.chuange.aishijing.service;

import com.chuange.aishijing.pojo.userManage.UserSealInformationLog;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
/**
 * 
 * @author yuany
 *
 */
public interface SealService {
	/**
	 * 封号
	 * @param pagesize
	 * @param currentPage
	 * @param id
	 * @return
	 */
	public UsersVO querySeal(Integer pagesize,Integer currentPage,String id);
	public UsersVO insertSeal(UserSealInformationLog log);

}

package com.chuange.aishijing.service;

import com.chuange.aishijing.pojo.userManage.UserSealInformation;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;

public interface SealInfoService {
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	public UsersVO querySealInfoByUserId(String id);
	/**
	 * 更新
	 * @param seal
	 */
	public UsersVO UpdateSealInfo(UserSealInformation seal);
}

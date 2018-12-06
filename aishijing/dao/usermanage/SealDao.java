package com.chuange.aishijing.dao.usermanage;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.userManage.UserReport;
import com.chuange.aishijing.pojo.userManage.UserSealInformation;
import com.chuange.aishijing.pojo.userManage.UserSealInformationLog;
/**
 * 
 * @author yuany
 * 封号日志
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserSealInformationLog.class,idClass = String.class)
public interface SealDao extends JpaRepository<UserSealInformationLog, String>{
	/**
	 * 封号操作信息
	 * @param pageable
	 * @param id
	 * @return
	 */
	Page<UserSealInformationLog> findAllByUserid(Pageable pageable,String id);
	/**
	 * 插入日志
	 */
}

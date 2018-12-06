package com.chuange.aishijing.dao.usermanage;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.userManage.UserReport;
/**
 * 
 * @author yuany
 * 举报历史
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserReport.class, idClass = String.class)
public interface ReportDao extends JpaRepository<UserReport, String>{
	/**
	 * 举报历史
	 */
	Page<UserReport> findAllByUserId(Pageable pageable,String id);

}

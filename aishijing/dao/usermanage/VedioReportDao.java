package com.chuange.aishijing.dao.usermanage;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager.class, idClass = String.class)
public interface VedioReportDao extends JpaRepository<VideoAndCommentReportManager, String>{
	/**
	 * 条件查询举报信息
	 * @param spec
	 * @param pageable
	 * @return
	 */
	Page<VideoAndCommentReportManager> findAll(Specification<VideoAndCommentReportManager> spec, Pageable pageable);
	@Modifying
	@Query(value="UPDATE VideoAndCommentReportManager  v SET v.processStatus= :status,v.processResult=:result WHERE v.id= :id")
	      int  update(String id,String status,String result);
}

package com.chuange.aishijing.dao.castsystem;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.castsystem.Interviewer;
/**
 * 
 * @author yuany
 * 面试人管理
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.castsystem.Interviewer.class, idClass = String.class)
public interface InterviewManagerDao extends JpaRepository<Interviewer, String>{
	<S extends Interviewer> Page<S> findAll(Specification<S> casts, Pageable pageable) ;
}

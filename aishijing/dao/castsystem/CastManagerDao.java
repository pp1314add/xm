package com.chuange.aishijing.dao.castsystem;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.castsystem.Drama;
/**
 * 
 * @author yuany
 * 剧本管理
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.castsystem.Drama.class, idClass = String.class)
public interface CastManagerDao extends JpaRepository<Drama, String>{
	<S extends Drama> Page<S> findAll(Specification<S> casts, Pageable pageable) ;
}

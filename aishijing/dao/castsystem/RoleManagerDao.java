package com.chuange.aishijing.dao.castsystem;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.castsystem.Role;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.castsystem.Role.class, idClass = String.class)
public interface RoleManagerDao extends JpaRepository<Role, String> {
	 <S extends Role> Page<S> findAll(Specification<S> roles, Pageable pageable) ;
}

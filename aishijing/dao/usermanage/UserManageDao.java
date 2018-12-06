package com.chuange.aishijing.dao.usermanage;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.userManage.User;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.User.class, idClass = String.class)
public interface UserManageDao extends JpaRepository<User, String>,JpaSpecificationExecutor<User>{
	/**
	 * 分页全部查询
	 */
	 Page<User> findAll(Pageable pageable);
	 /**
	  * 分页模糊查询
	  */
	 @Override
	 Page<User> findAll(Specification<User> spec, Pageable pageable);
	 /**
	  * 用户详情查询
	  */
	 @Override
	 Optional<User> findById(String id);
	 
}

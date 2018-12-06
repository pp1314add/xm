package com.chuange.aishijing.dao.loginuser;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
/**
 * 
 * @author yuany
 * 获取index页面树结构
 */

import com.chuange.aishijing.pojo.tree.Tree;
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.tree.Tree.class, idClass = String.class)
public interface IndexDao extends JpaRepository<Tree, String>{
	 List<Tree> findAllByResourceType(String resourceType);
		// TODO Auto-generated method stub
}

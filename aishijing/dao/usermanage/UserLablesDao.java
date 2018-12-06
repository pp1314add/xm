package com.chuange.aishijing.dao.usermanage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.userManage.UserLable;
/**
 * 
 * @author yuany
 * 标签
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserLable.class, idClass = String.class)
public interface UserLablesDao extends JpaRepository<UserLable, String>{
	 List<UserLable> findAllByUseridAndType(String id,String type) ;
}

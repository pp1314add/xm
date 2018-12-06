package com.chuange.aishijing.dao.usermanage;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.userManage.UserEducation;
/**
 * 
 * @author yuany
 * 教育背景
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserEducation.class, idClass = String.class)
public interface EducationDao extends JpaRepository<UserEducation, String>{
	 Optional<UserEducation> findByUserid(String id) ;
}

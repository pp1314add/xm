package com.chuange.aishijing.dao.usermanage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.pojo.userManage.UserMovie;
/**
 * 
 * @author yuany
 * 影视经历
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserMovie.class, idClass = String.class)
public interface UserMoviesDao extends JpaRepository<UserMovie, String>{
	 List<UserMovie> findAllByUserId(String id) ;
}

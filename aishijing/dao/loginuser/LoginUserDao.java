package com.chuange.aishijing.dao.loginuser;
import com.chuange.aishijing.pojo.login.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2018-11-09.
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.login.LoginUser.class, idClass = Integer.class)
public interface LoginUserDao extends JpaRepository<LoginUser,String> {

    LoginUser findAllByName(String name);
}

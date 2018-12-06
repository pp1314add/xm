package com.chuange.aishijing.service.impl.LoginUser;

import com.chuange.aishijing.dao.loginuser.LoginUserDao;
import com.chuange.aishijing.pojo.login.LoginUser;
import com.chuange.aishijing.service.LoginUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2018-11-09.
 */
@Service
@Transactional
public class LoginUserImpl implements LoginUserService{
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    private LoginUserDao loginUserDao;
    @Override
    public LoginUser selectUser(String username) {
        LoginUser user = loginUserDao.findAllByName(username);
        System.out.println(user);
        if(null==user.getPassword()||"".equals(user.getPassword())){
            logger.info("查询密码失败");
        }
        return user;
    }

    @Override
    public String insertUser(LoginUser loginUser) {
        loginUserDao.save(loginUser);
        return "注册成功";
    }
}

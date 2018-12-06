package com.chuange.aishijing.service;

import com.chuange.aishijing.pojo.login.LoginUser;

/**
 * Created by Administrator on 2018-11-09.
 */
public interface LoginUserService {
    LoginUser selectUser(String username);
    String insertUser(LoginUser loginUser);
}

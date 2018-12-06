package com.chuange.aishijing.controller.login;

import com.chuange.aishijing.pojo.login.LoginUser;
import com.chuange.aishijing.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018-11-12.
 */
@RestController
@SpringBootApplication
public class RegistController {
    @Autowired
    private  LoginUserService loginUserService;

    @ResponseBody
    @RequestMapping("/regist")
    public String regists(@RequestParam(value="name",required=false) String name, @RequestParam(value="pwd",required = false) String pwd){
        LoginUser loginUser = new LoginUser();
        loginUser.setName(name);
        loginUser.setPassword(pwd);
        String message = loginUserService.insertUser(loginUser);
        message = "success";
        System.out.print(message);
        return message;
    }

}

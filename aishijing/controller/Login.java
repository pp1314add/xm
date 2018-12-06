package com.chuange.aishijing.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author yuany
 * 登陆逻辑判断
 */
@Controller
@SpringBootApplication
public class Login {
	@RequestMapping("/logins")
    public String login() {
        return "ishijing/login";
    }
    public static void main( String[] args )
    {
        new SpringApplication(Login.class).run(args);
    }
}

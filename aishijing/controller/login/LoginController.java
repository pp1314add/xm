package com.chuange.aishijing.controller.login;

import com.chuange.aishijing.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoginController {
	@Autowired
	private LoginUserService loginUserService;

	@ResponseBody
	@PostMapping("/judge")
    public String login(@RequestParam String name,@RequestParam String pwd) {
		String password = loginUserService.selectUser(name);
		String result="";
		if(pwd.equals(password)) {
			result="success";
		}else {
			result="failed";
		}
		return result;
    }
}

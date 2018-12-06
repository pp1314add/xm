package com.chuange.aishijing.pojo.login;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 用户表
 */
@Entity
@Table(name="ASJ_LOGINUSER")
public class LoginUser {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;//用户名
	private String password;//密码
	private Date logintime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public LoginUser(String name, String password, Date logintime) {
		this.name = name;
		this.password = password;
		this.logintime = logintime;
	}

	public Date getLogintime() {
		return logintime;
	}
	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}
	@Override
	public String toString() {
		return "LoginUser [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

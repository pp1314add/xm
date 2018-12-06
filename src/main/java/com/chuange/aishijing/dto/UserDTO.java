package com.chuange.aishijing.dto;

import java.util.Date;

public class UserDTO {
	private Date logintimefrom;
	private Date registtimefrom;
	private Date logintimeto;
	private Date registtimeto;
	private String sex;
	private String age;
	private String authenticationType;
	public Date getLogintimefrom() {
		return logintimefrom;
	}
	public void setLogintimefrom(Date logintimefrom) {
		this.logintimefrom = logintimefrom;
	}
	public Date getRegisttimefrom() {
		return registtimefrom;
	}
	public void setRegisttimefrom(Date registtimefrom) {
		this.registtimefrom = registtimefrom;
	}
	public Date getLogintimeto() {
		return logintimeto;
	}
	public void setLogintimeto(Date logintimeto) {
		this.logintimeto = logintimeto;
	}
	public Date getRegisttimeto() {
		return registtimeto;
	}
	public void setRegisttimeto(Date registtimeto) {
		this.registtimeto = registtimeto;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public UserDTO(Date logintimefrom, Date registtimefrom, Date logintimeto, Date registtimeto, String sex, String age,
			String authenticationType) {
		super();
		this.logintimefrom = logintimefrom;
		this.registtimefrom = registtimefrom;
		this.logintimeto = logintimeto;
		this.registtimeto = registtimeto;
		this.sex = sex;
		this.age = age;
		this.authenticationType = authenticationType;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDTO [logintimefrom=" + logintimefrom + ", registtimefrom=" + registtimefrom + ", logintimeto="
				+ logintimeto + ", registtimeto=" + registtimeto + ", sex=" + sex + ", age=" + age
				+ ", authenticationType=" + authenticationType + "]";
	}
	
}

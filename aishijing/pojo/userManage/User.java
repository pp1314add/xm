package com.chuange.aishijing.pojo.userManage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 */
@Entity
@Table(name="ASJ_USER")
public class User {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String username;//会员昵称
    private String userPicture;//用户头像
    private String sex;//性别
    private String age;//年龄
    private String telphone;//手机号码
    private String area;//所在地区
    private String authenticationType;//认证类型
    private String crew;//所属剧组
    private String economicCompany;//经济公司
    private Date registrationTime;//注册时间
    private Date lastloginTime;//最后登录时间

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", userPicture='" + userPicture + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", telphone='" + telphone + '\'' +
                ", area='" + area + '\'' +
                ", authenticationType='" + authenticationType + '\'' +
                ", crew='" + crew + '\'' +
                ", economicCompany='" + economicCompany + '\'' +
                ", registrationTime=" + registrationTime +
                ", lastloginTime=" + lastloginTime +
                '}';
    }

    public User(String username, String userPicture, String sex, String age, String telphone, String area, String authenticationType, String crew, String economicCompany, Date registrationTime, Date lastloginTime) {
        this.username = username;
        this.userPicture = userPicture;
        this.sex = sex;
        this.age = age;
        this.telphone = telphone;
        this.area = area;
        this.authenticationType = authenticationType;
        this.crew = crew;
        this.economicCompany = economicCompany;
        this.registrationTime = registrationTime;
        this.lastloginTime = lastloginTime;
    }

    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
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

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getEconomicCompany() {
        return economicCompany;
    }

    public void setEconomicCompany(String economicCompany) {
        this.economicCompany = economicCompany;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }
}

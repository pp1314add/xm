package com.chuange.aishijing.pojo.userManage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-14.
 */
@Entity
@Table(name="ASJ_USEREDUCATION")
public class UserEducation {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String userid;//关联userid
    private String graduateSchool;//毕业学校
    private String subject;//专业
    private String levelSchool;//学校级别
    private String fromtoTime;//入学时间
    private Date graduateTime;//毕业时间
    private String introduceMyself;//自我介绍
    public UserEducation(){}

    public UserEducation(String userid, String graduateSchool, String subject, String levelSchool, String fromtoTime, Date graduateTime, String introduceMyself) {
        this.userid = userid;
        this.graduateSchool = graduateSchool;
        this.subject = subject;
        this.levelSchool = levelSchool;
        this.fromtoTime = fromtoTime;
        this.graduateTime = graduateTime;
        this.introduceMyself = introduceMyself;
    }


    public String getFromtoTime() {
        return fromtoTime;
    }

    public void setFromtoTime(String fromtoTime) {
        this.fromtoTime = fromtoTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLevelSchool() {
        return levelSchool;
    }

    public void setLevelSchool(String levelSchool) {
        this.levelSchool = levelSchool;
    }

    public Date getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(Date graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getIntroduceMyself() {
        return introduceMyself;
    }

    public void setIntroduceMyself(String introduceMyself) {
        this.introduceMyself = introduceMyself;
    }
}

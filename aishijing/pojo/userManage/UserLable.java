package com.chuange.aishijing.pojo.userManage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-14.
 */
@Entity
@Table(name="ASJ_USERELABLE")
public class UserLable {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String userid;//关联user表
    private String description;//描述
    private String type;//分类
    public UserLable(){}

    public UserLable(String userid, String description, String type) {
        this.userid = userid;
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserLable{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package com.chuange.aishijing.pojo.sysmanage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 管理组
 */
@Entity
@Table(name="ASJ_MANAGERMENTGROUP")
public class ManagementGroup {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String managermentgroupName;//管理组名称
    private String description;//描述
    private Date createTime;//创建时间
    private String createUser;//创建人

    @Override
    public String toString() {
        return "ManagementGroup{" +
                "id='" + id + '\'' +
                ", managermentgroupName='" + managermentgroupName + '\'' +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                '}';
    }

    public ManagementGroup(String managermentgroupName, String description, Date createTime, String createUser) {
        this.managermentgroupName = managermentgroupName;
        this.description = description;
        this.createTime = createTime;
        this.createUser = createUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManagermentgroupName() {
        return managermentgroupName;
    }

    public void setManagermentgroupName(String managermentgroupName) {
        this.managermentgroupName = managermentgroupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}

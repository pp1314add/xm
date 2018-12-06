package com.chuange.aishijing.pojo.sysmanage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 管理员
 */
@Entity
@Table(name="ASJ_MANAGERMENTPERSON")
public class ManagermentPerson {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String managermentpersonName;//管理员名称
    private String belongmanagermentGroup;//所属管理组
    private Date createTime;//创建时间
    private String createUser;//创建人

    @Override
    public String toString() {
        return "ManagermentPerson{" +
                "id='" + id + '\'' +
                ", managermentpersonName='" + managermentpersonName + '\'' +
                ", belongmanagermentGroup='" + belongmanagermentGroup + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                '}';
    }

    public ManagermentPerson(String managermentpersonName, String belongmanagermentGroup, Date createTime, String createUser) {
        this.managermentpersonName = managermentpersonName;
        this.belongmanagermentGroup = belongmanagermentGroup;
        this.createTime = createTime;
        this.createUser = createUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManagermentpersonName() {
        return managermentpersonName;
    }

    public void setManagermentpersonName(String managermentpersonName) {
        this.managermentpersonName = managermentpersonName;
    }

    public String getBelongmanagermentGroup() {
        return belongmanagermentGroup;
    }

    public void setBelongmanagermentGroup(String belongmanagermentGroup) {
        this.belongmanagermentGroup = belongmanagermentGroup;
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

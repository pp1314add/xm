package com.chuange.aishijing.pojo.userManage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by Administrator on 2018-11-07.
 * 封号信息
 */
@Entity
@Table(name="ASJ_USERSEALINFORMATION")
public class UserSealInformation {
    @Id
    @NotNull
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name="idGenerator", strategy="uuid")
    @GeneratedValue(generator="idGenerator")
    private Long id;
    private String userId;//关联用户id
    private String userStatus;//当前用户状态
    private String freezingPeriod;//冻结周期
    private String remark;//备注
    
    public UserSealInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "UserSealInformation{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", freezingPeriod='" + freezingPeriod + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public UserSealInformation(String userId, String userStatus, String freezingPeriod, String remark) {
        this.userId = userId;
        this.userStatus = userStatus;
        this.freezingPeriod = freezingPeriod;
        this.remark = remark;
    }


    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getFreezingPeriod() {
        return freezingPeriod;
    }

    public void setFreezingPeriod(String freezingPeriod) {
        this.freezingPeriod = freezingPeriod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

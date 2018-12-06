package com.chuange.aishijing.pojo.userManage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by Administrator on 2018-11-07.
 * 用户操作封号历史
 */
@Entity
@Table(name="ASJ_USERSEALINFORMATIONLOG")
public class UserSealInformationLog {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String operaName;//操作用户
    private String operaTime;//操作时间
    private String freezingPeriod;//冻结周期
    private String remark;//备注
    private String userid;//封号id

    public UserSealInformationLog(@NotNull String id, String operaName, String operaTime, String freezingPeriod,
			String remark, String userid) {
		super();
		this.id = id;
		this.operaName = operaName;
		this.operaTime = operaTime;
		this.freezingPeriod = freezingPeriod;
		this.remark = remark;
		this.userid = userid;
	}

	public UserSealInformationLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserSealInformationLog [id=" + id + ", operaName=" + operaName + ", operaTime=" + operaTime
				+ ", freezingPeriod=" + freezingPeriod + ", remark=" + remark + ", userid=" + userid + "]";
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperaName() {
        return operaName;
    }

    public void setOperaName(String operaName) {
        this.operaName = operaName;
    }

    public String getOperaTime() {
        return operaTime;
    }

    public void setOperaTime(String operaTime) {
        this.operaTime = operaTime;
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

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
    
}

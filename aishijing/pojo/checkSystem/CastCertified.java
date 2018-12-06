package com.chuange.aishijing.pojo.checkSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
/* 剧组认证
 */
@Entity
@Table(name="ASJ_CASTCERTIFIED")
public class CastCertified {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String username;//用户昵称
	private String userid;//用户id
	private String businessLicense;//营业执照
	private String recordNum;//备案号
	private String shootingProof;//拍摄证明
	private String recordProof;//备案证明
	private String handleStatus;//审核状态
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getRecordNum() {
		return recordNum;
	}
	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}
	public String getShootingProof() {
		return shootingProof;
	}
	public void setShootingProof(String shootingProof) {
		this.shootingProof = shootingProof;
	}
	public String getRecordProof() {
		return recordProof;
	}
	public void setRecordProof(String recordProof) {
		this.recordProof = recordProof;
	}
	public String getHandleStatus() {
		return handleStatus;
	}
	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}
	@Override
	public String toString() {
		return "CastCertified [id=" + id + ", username=" + username + ", userid=" + userid + ", businessLicense="
				+ businessLicense + ", recordNum=" + recordNum + ", shootingProof=" + shootingProof + ", recordProof="
				+ recordProof + ", handleStatus=" + handleStatus + "]";
	}
	public CastCertified(@NotNull String id, String username, String userid, String businessLicense, String recordNum,
			String shootingProof, String recordProof, String handleStatus) {
		super();
		this.id = id;
		this.username = username;
		this.userid = userid;
		this.businessLicense = businessLicense;
		this.recordNum = recordNum;
		this.shootingProof = shootingProof;
		this.recordProof = recordProof;
		this.handleStatus = handleStatus;
	}
	public CastCertified() {
		super();
		// TODO Auto-generated constructor stub
	}
}

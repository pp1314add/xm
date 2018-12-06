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
 * 实名认证
 */
@Entity
@Table(name="ASJ_CERTIFICATION")
public class Certification {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String username;//用户昵称
	private String realname;//用户真名
	private String userid;//用户id
	private String Idcard;//身份证号
	private String Idfront;//身份证正面
	private String Idback;//身份证反面
	private String status;//审核状态
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
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getIdcard() {
		return Idcard;
	}
	public void setIdcard(String idcard) {
		Idcard = idcard;
	}
	public String getIdfront() {
		return Idfront;
	}
	public void setIdfront(String idfront) {
		Idfront = idfront;
	}
	public String getIdback() {
		return Idback;
	}
	public void setIdback(String idback) {
		Idback = idback;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Certification [id=" + id + ", username=" + username + ", realname=" + realname + ", userid=" + userid
				+ ", Idcard=" + Idcard + ", Idfront=" + Idfront + ", Idback=" + Idback + ", status=" + status + "]";
	}
	public Certification(@NotNull String id, String username, String realname, String userid, String idcard,
			String idfront, String idback, String status) {
		super();
		this.id = id;
		this.username = username;
		this.realname = realname;
		this.userid = userid;
		Idcard = idcard;
		Idfront = idfront;
		Idback = idback;
		this.status = status;
	}
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}
}

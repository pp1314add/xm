package com.chuange.aishijing.pojo.recommendmanage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 热门角色
 */
@Entity
@Table(name="ASJ_HOTROLE")
public class HotRole {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String roleName;//角色名称
	private	String roleCast;//角色所属脚本
	private String showterminal;//显示终端
	private String status;//状态
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCast() {
		return roleCast;
	}
	public void setRoleCast(String roleCast) {
		this.roleCast = roleCast;
	}
	public String getShowterminal() {
		return showterminal;
	}
	public void setShowterminal(String showterminal) {
		this.showterminal = showterminal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "HotRole [id=" + id + ", roleName=" + roleName + ", roleCast=" + roleCast + ", showterminal="
				+ showterminal + ", status=" + status + "]";
	}
	public HotRole(@NotNull String id, String roleName, String roleCast, String showterminal, String status) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.roleCast = roleCast;
		this.showterminal = showterminal;
		this.status = status;
	}
	public HotRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

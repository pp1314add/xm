package com.chuange.aishijing.pojo.castsystem;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * @author yuany
 * 剧本
 */
@Entity
@Table(name="ASJ_DRAMA")
public class Drama {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String castname;//剧本名称
	private String publish;//出品方
	private String area;//地区
	private String director;//导演
	private String writor;//编剧
	private String type;//类型
	private String theme;//题材
	private String status;//状态
	private String years;//年代
	private String platform;//播放平台
	@Temporal(TemporalType.DATE)
	private Date shootingTime;//开机时间
	private String shootArea;//拍摄地点
	private String assistant;//助理
	private String assiPhone;//助理电话
	private String assiEmail;//助理邮箱
	private String planCity;//筹备城市
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date recruitStartTime;//招募开始时间
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date recruitEndTime;//招募结束时间
	private String summary;//剧情介绍
	private Integer roleNum;//角色数量
	private Integer auditionNum;//试镜数量
	private String inviteActor;//已邀请演员
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCastname() {
		return castname;
	}
	public void setCastname(String castname) {
		this.castname = castname;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWritor() {
		return writor;
	}
	public void setWritor(String writor) {
		this.writor = writor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getShootArea() {
		return shootArea;
	}
	public void setShootArea(String shootArea) {
		this.shootArea = shootArea;
	}
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	public String getAssiPhone() {
		return assiPhone;
	}
	public void setAssiPhone(String assiPhone) {
		this.assiPhone = assiPhone;
	}
	public String getAssiEmail() {
		return assiEmail;
	}
	public void setAssiEmail(String assiEmail) {
		this.assiEmail = assiEmail;
	}
	public String getPlanCity() {
		return planCity;
	}
	public void setPlanCity(String planCity) {
		this.planCity = planCity;
	}
	public Date getRecruitStartTime() {
		return recruitStartTime;
	}
	public void setRecruitStartTime(Date recruitStartTime) {
		this.recruitStartTime = recruitStartTime;
	}
	public Date getRecruitEndTime() {
		return recruitEndTime;
	}
	public void setRecruitEndTime(Date recruitEndTime) {
		this.recruitEndTime = recruitEndTime;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Integer getRoleNum() {
		return roleNum;
	}
	public void setRoleNum(Integer roleNum) {
		this.roleNum = roleNum;
	}
	public Integer getAuditionNum() {
		return auditionNum;
	}
	public void setAuditionNum(Integer auditionNum) {
		this.auditionNum = auditionNum;
	}
	public String getInviteActor() {
		return inviteActor;
	}
	public void setInviteActor(String inviteActor) {
		this.inviteActor = inviteActor;
	}
	
	public Date getShootingTime() {
		return shootingTime;
	}
	public void setShootingTime(Date shootingTime) {
		this.shootingTime = shootingTime;
	}
	@Override
	public String toString() {
		return "Drama [id=" + id + ", castname=" + castname + ", publish=" + publish + ", area=" + area + ", director="
				+ director + ", writor=" + writor + ", type=" + type + ", theme=" + theme + ", status=" + status
				+ ", years=" + years + ", platform=" + platform + ", shootingTime=" + shootingTime + ", shootArea="
				+ shootArea + ", assistant=" + assistant + ", assiPhone=" + assiPhone + ", assiEmail=" + assiEmail
				+ ", planCity=" + planCity + ", recruitStartTime=" + recruitStartTime + ", recruitEndTime="
				+ recruitEndTime + ", summary=" + summary + ", roleNum=" + roleNum + ", auditionNum=" + auditionNum
				+ ", inviteActor=" + inviteActor + "]";
	}
	public Drama(@NotNull String id, String castname, String publish, String area, String director, String writor,
			String type, String theme, String status, String years, String platform, Date shootingTime,
			String shootArea, String assistant, String assiPhone, String assiEmail, String planCity,
			Date recruitStartTime, Date recruitEndTime, String summary, Integer roleNum, Integer auditionNum,
			String inviteActor) {
		super();
		this.id = id;
		this.castname = castname;
		this.publish = publish;
		this.area = area;
		this.director = director;
		this.writor = writor;
		this.type = type;
		this.theme = theme;
		this.status = status;
		this.years = years;
		this.platform = platform;
		this.shootingTime = shootingTime;
		this.shootArea = shootArea;
		this.assistant = assistant;
		this.assiPhone = assiPhone;
		this.assiEmail = assiEmail;
		this.planCity = planCity;
		this.recruitStartTime = recruitStartTime;
		this.recruitEndTime = recruitEndTime;
		this.summary = summary;
		this.roleNum = roleNum;
		this.auditionNum = auditionNum;
		this.inviteActor = inviteActor;
	}
	public Drama() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

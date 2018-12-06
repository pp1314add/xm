package com.chuange.aishijing.pojo.castsystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
 * @author yuany
 * 面试人
 */
@Entity
@Table(name="ASJ_INTERVIEWER")
public class Interviewer {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String interviewer;//面试人
	private String auditionPlace;//面试地址
	private String auditionPhone;//面试人电弧
	private String interviewerEmail;//面试人邮箱
	private String castName;//剧本名称
	private String interviewerPlace;//面试人地址
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}
	public String getAuditionPlace() {
		return auditionPlace;
	}
	public void setAuditionPlace(String auditionPlace) {
		this.auditionPlace = auditionPlace;
	}
	public String getAuditionPhone() {
		return auditionPhone;
	}
	public void setAuditionPhone(String auditionPhone) {
		this.auditionPhone = auditionPhone;
	}
	public String getInterviewerEmail() {
		return interviewerEmail;
	}
	public void setInterviewerEmail(String interviewerEmail) {
		this.interviewerEmail = interviewerEmail;
	}
	public String getCastName() {
		return castName;
	}
	public void setCastName(String castName) {
		this.castName = castName;
	}
	public String getInterviewerPlace() {
		return interviewerPlace;
	}
	public void setInterviewerPlace(String interviewerPlace) {
		this.interviewerPlace = interviewerPlace;
	}
	@Override
	public String toString() {
		return "Interviewer [id=" + id + ", interviewer=" + interviewer + ", auditionPlace=" + auditionPlace
				+ ", auditionPhone=" + auditionPhone + ", interviewerEmail=" + interviewerEmail + ", castName="
				+ castName + ", interviewerPlace=" + interviewerPlace + "]";
	}
	public Interviewer(@NotNull String id, String interviewer, String auditionPlace, String auditionPhone,
			String interviewerEmail, String castName, String interviewerPlace) {
		super();
		this.id = id;
		this.interviewer = interviewer;
		this.auditionPlace = auditionPlace;
		this.auditionPhone = auditionPhone;
		this.interviewerEmail = interviewerEmail;
		this.castName = castName;
		this.interviewerPlace = interviewerPlace;
	}
	public Interviewer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

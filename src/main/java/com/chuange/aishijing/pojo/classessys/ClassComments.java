package com.chuange.aishijing.pojo.classessys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author yuany
 * 课程评价表
 */
@Entity
@Table(name="ASJ_CLASSCOMMENTS")
public class ClassComments {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date commentTime;//评论时间
	private String commentUser;//评论用户
	private String userId;//用户id
	private String classname;//课程名称
	private String commentContent;//评价内容
	private long classId; //课程id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentUser() {
		return commentUser;
	}
	public void setCommentUser(String commentUser) {
		this.commentUser = commentUser;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public long getClassId() {
		return classId;
	}

	public void setClassId(long classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "ClassComments [id=" + id + ", commentTime=" + commentTime + ", commentUser=" + commentUser + ", userId="
				+ userId + ", classname=" + classname + ", commentContent=" + commentContent + "]";
	}

	public ClassComments(Date commentTime, String commentUser, String userId, String classname, String commentContent, long classId) {
		this.commentTime = commentTime;
		this.commentUser = commentUser;
		this.userId = userId;
		this.classname = classname;
		this.commentContent = commentContent;
		this.classId = classId;
	}


	public ClassComments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

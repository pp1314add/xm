package com.chuange.aishijing.pojo.castsystem;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author yuany
 * 演员招募表
 */
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="ASJ_RECRUITINTERVIEWER")
public class RecruitInterviewer {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String deliver;//投递人
	@Temporal(TemporalType.DATE)
	private Date deliverTime;//投递时间
	private String confirmType;//认证类型
	private String deliverVideo;//投递视频
	private String auditionStatus;//试镜状态
	private String remark;//备注
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConfirmType() {
		return confirmType;
	}
	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}
	public String getDeliver() {
		return deliver;
	}
	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}
	public Date getDeliverTime() {
		return deliverTime;
	}
	public void setDeliverTime(Date deliverTime) {
		this.deliverTime = deliverTime;
	}
	public String getDeliverVideo() {
		return deliverVideo;
	}
	public void setDeliverVideo(String deliverVideo) {
		this.deliverVideo = deliverVideo;
	}
	public String getAuditionStatus() {
		return auditionStatus;
	}
	public void setAuditionStatus(String auditionStatus) {
		this.auditionStatus = auditionStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public RecruitInterviewer(@NotNull String id, String deliver, Date deliverTime, String confirmType,
			String deliverVideo, String auditionStatus, String remark) {
		super();
		this.id = id;
		this.deliver = deliver;
		this.deliverTime = deliverTime;
		this.confirmType = confirmType;
		this.deliverVideo = deliverVideo;
		this.auditionStatus = auditionStatus;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "RecruitInterviewer [id=" + id + ", deliver=" + deliver + ", deliverTime=" + deliverTime
				+ ", confirmType=" + confirmType + ", deliverVideo=" + deliverVideo + ", auditionStatus="
				+ auditionStatus + ", remark=" + remark + "]";
	}
	public RecruitInterviewer() {
		super();
		// TODO Auto-generated constructor stub
	}
}

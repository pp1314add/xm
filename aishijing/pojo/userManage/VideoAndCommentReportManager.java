package com.chuange.aishijing.pojo.userManage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 视频举报管理
 */
@Entity
@Table(name="ASJ_VIDEOANDCOMMENTREPORTMANAGER")
public class VideoAndCommentReportManager {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    @Temporal(TemporalType.DATE)
    private Date reportTime;//举报时间
    private String reportedTel;//被举报人手机号
    private String reportedId;//被举报人id
    private String reportedName;//被举报人昵称
    private String reportedVideo ;//被举报视频
    private String reportedContent ;//被举报内容
    private String reportType;//举报类型
    private String reporter;//举报人
    private String reportDescription;//举报描述
    private String processStatus;//处理状态
    private String processResult;//处理结果
    private String reportCategory;//举报分类(视频举报，评论举报)


    public VideoAndCommentReportManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VideoAndCommentReportManager(@NotNull String id, Date reportTime, String reportedTel, String reportedId,
			String reportedName, String reportedVideo, String reportedContent, String reportType, String reporter,
			String reportDescription, String processStatus, String processResult, String reportCategory) {
		super();
		this.id = id;
		this.reportTime = reportTime;
		this.reportedTel = reportedTel;
		this.reportedId = reportedId;
		this.reportedName = reportedName;
		this.reportedVideo = reportedVideo;
		this.reportedContent = reportedContent;
		this.reportType = reportType;
		this.reporter = reporter;
		this.reportDescription = reportDescription;
		this.processStatus = processStatus;
		this.processResult = processResult;
		this.reportCategory = reportCategory;
	}

	@Override
	public String toString() {
		return "VideoAndCommentReportManager [id=" + id + ", reportTime=" + reportTime + ", reportedTel=" + reportedTel
				+ ", reportedId=" + reportedId + ", reportedName=" + reportedName + ", reportedVideo=" + reportedVideo
				+ ", reportedContent=" + reportedContent + ", reportType=" + reportType + ", reporter=" + reporter
				+ ", reportDescription=" + reportDescription + ", processStatus=" + processStatus + ", processResult="
				+ processResult + ", reportCategory=" + reportCategory + "]";
	}

	public String getReportedContent() {
		return reportedContent;
	}

	public void setReportedContent(String reportedContent) {
		this.reportedContent = reportedContent;
	}

	public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportedTel() {
        return reportedTel;
    }

    public void setReportedTel(String reportedTel) {
        this.reportedTel = reportedTel;
    }

    public String getReportedId() {
        return reportedId;
    }

    public void setReportedId(String reportedId) {
        this.reportedId = reportedId;
    }

    public String getReportedName() {
        return reportedName;
    }

    public void setReportedName(String reportedName) {
        this.reportedName = reportedName;
    }

    public String getReportedVideo() {
        return reportedVideo;
    }

    public void setReportedVideo(String reportedVideo) {
        this.reportedVideo = reportedVideo;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }
}

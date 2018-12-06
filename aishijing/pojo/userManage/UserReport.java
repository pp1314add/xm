package com.chuange.aishijing.pojo.userManage;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-07.
 * 用户举报历史
 */
@Entity
@Table(name="ASJ_USERREPORT")
public class UserReport {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String userId;//关联用户id
    private Date reportedTime;//被举报时间
    private String reportedTel;//被举报人手机号
    private String reportedType;//举报类型
    private String reportId;//举报人id
    private String reportName;//举报人昵称
    private String reportDescription;//举报人描述
    private String processState;//处理状态
    private String processResult;//处理结果
    private String reportedContent;//举报内容


	public UserReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserReport(@NotNull String id, String userId, Date reportedTime, String reportedTel, String reportedType,
			String reportId, String reportName, String reportDescription, String processState, String processResult,
			String reportedContent) {
		super();
		this.id = id;
		this.userId = userId;
		this.reportedTime = reportedTime;
		this.reportedTel = reportedTel;
		this.reportedType = reportedType;
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportDescription = reportDescription;
		this.processState = processState;
		this.processResult = processResult;
		this.reportedContent = reportedContent;
	}

	@Override
	public String toString() {
		return "UserReport [id=" + id + ", userId=" + userId + ", reportedTime=" + reportedTime + ", reportedTel="
				+ reportedTel + ", reportedType=" + reportedType + ", reportId=" + reportId + ", reportName="
				+ reportName + ", reportDescription=" + reportDescription + ", processState=" + processState
				+ ", processResult=" + processResult + ", reportedContent=" + reportedContent + "]";
	}

	public String getReportedContent() {
		return reportedContent;
	}

	public void setReportedContent(String reportedContent) {
		this.reportedContent = reportedContent;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getReportedTime() {
		return reportedTime;
	}

	public void setReportedTime(Date reportedTime) {
		this.reportedTime = reportedTime;
	}

	public String getReportedTel() {
        return reportedTel;
    }

    public void setReportedTel(String reportedTel) {
        this.reportedTel = reportedTel;
    }

    public String getReportedType() {
        return reportedType;
    }

    public void setReportedType(String reportedType) {
        this.reportedType = reportedType;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getProcessState() {
        return processState;
    }

    public void setProcessState(String processState) {
        this.processState = processState;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }
}

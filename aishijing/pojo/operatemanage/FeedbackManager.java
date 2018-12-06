package com.chuange.aishijing.pojo.operatemanage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 反馈管理
 */
@Entity
@Table(name="ASJ_FEEDBACKMANAGER")
public class FeedbackManager {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String submitter;//提交人
    private String submitterTel;//提交人手机号码
    private String userId;//用户ID
    private String feedbackType;//反馈类型
    private Date feedbackTime;//反馈时间
    private String feedbackContent;//反馈内容
    private String processPerson;//处理人
    private String status;//状态

    @Override
    public String toString() {
        return "FeedbackManager{" +
                "id='" + id + '\'' +
                ", submitter='" + submitter + '\'' +
                ", submitterTel='" + submitterTel + '\'' +
                ", userId='" + userId + '\'' +
                ", feedbackType='" + feedbackType + '\'' +
                ", feedbackTime=" + feedbackTime +
                ", feedbackContent='" + feedbackContent + '\'' +
                ", processPerson='" + processPerson + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public FeedbackManager(String submitter, String submitterTel, String userId, String feedbackType, Date feedbackTime, String feedbackContent, String processPerson, String status) {
        this.submitter = submitter;
        this.submitterTel = submitterTel;
        this.userId = userId;
        this.feedbackType = feedbackType;
        this.feedbackTime = feedbackTime;
        this.feedbackContent = feedbackContent;
        this.processPerson = processPerson;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getSubmitterTel() {
        return submitterTel;
    }

    public void setSubmitterTel(String submitterTel) {
        this.submitterTel = submitterTel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getProcessPerson() {
        return processPerson;
    }

    public void setProcessPerson(String processPerson) {
        this.processPerson = processPerson;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

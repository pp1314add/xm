package com.chuange.aishijing.pojo.videoSystem;

import javax.persistence.*;
import javax.print.DocFlavor;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 视频信息
 */
@Entity
@Table(name="ASJ_VIDEO")
public class Video {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String publisher;//发布人
    private String userId;//关联用户id
    private Date publishTime;//发布时间
    private String videoName;//视频名称
    private String videoUrl;//视频
    private String scripts;//所属剧本
    private String role;//角色
    private String clicks;//点击量
    private String reviewNumber;//点评数
    private String commentsNumber;//评论数
    private String score;//评分
    private String videoStatus;//视频状态

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", userId='" + userId + '\'' +
                ", publishTime=" + publishTime +
                ", videoName='" + videoName + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", scripts='" + scripts + '\'' +
                ", role='" + role + '\'' +
                ", clicks='" + clicks + '\'' +
                ", reviewNumber='" + reviewNumber + '\'' +
                ", commentsNumber='" + commentsNumber + '\'' +
                ", score='" + score + '\'' +
                ", videoStatus='" + videoStatus + '\'' +
                '}';
    }

    public Video(String publisher, String userId, Date publishTime, String videoName, String videoUrl, String scripts, String role, String clicks, String reviewNumber, String commentsNumber, String score, String videoStatus) {
        this.publisher = publisher;
        this.userId = userId;
        this.publishTime = publishTime;
        this.videoName = videoName;
        this.videoUrl = videoUrl;
        this.scripts = scripts;
        this.role = role;
        this.clicks = clicks;
        this.reviewNumber = reviewNumber;
        this.commentsNumber = commentsNumber;
        this.score = score;
        this.videoStatus = videoStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getScripts() {
        return scripts;
    }

    public void setScripts(String scripts) {
        this.scripts = scripts;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getClicks() {
        return clicks;
    }

    public void setClicks(String clicks) {
        this.clicks = clicks;
    }

    public String getReviewNumber() {
        return reviewNumber;
    }

    public void setReviewNumber(String reviewNumber) {
        this.reviewNumber = reviewNumber;
    }

    public String getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(String commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus;
    }
}

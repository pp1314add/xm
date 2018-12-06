package com.chuange.aishijing.pojo.videoSystem;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 */
@Entity
@Table(name="ASJ_VIDEOCOMMENT")
public class VideoComment {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Date commentTime;//评论时间
    private String commentUser;//评论用户
    private String userId;//用户id
    private String commentedVideo;//被评论视频
    private String commentContent;//评论内容

    @Override
    public String toString() {
        return "VideoComment{" +
                "id='" + id + '\'' +
                ", commentTime=" + commentTime +
                ", commentUser='" + commentUser + '\'' +
                ", userId='" + userId + '\'' +
                ", commentedVideo='" + commentedVideo + '\'' +
                ", commentContent='" + commentContent + '\'' +
                '}';
    }

    public VideoComment(Date commentTime, String commentUser, String userId, String commentedVideo, String commentContent) {
        this.commentTime = commentTime;
        this.commentUser = commentUser;
        this.userId = userId;
        this.commentedVideo = commentedVideo;
        this.commentContent = commentContent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getCommentedVideo() {
        return commentedVideo;
    }

    public void setCommentedVideo(String commentedVideo) {
        this.commentedVideo = commentedVideo;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}

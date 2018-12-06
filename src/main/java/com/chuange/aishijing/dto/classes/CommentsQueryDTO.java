package com.chuange.aishijing.dto.classes;

import javax.validation.constraints.NotNull;

/**
 * @author augus
 * @create 2018/11/27 13:28
 */
public class CommentsQueryDTO {
    @NotNull
    private long classId;// classid
    private String commentUser ;

    @Override
    public String toString() {
        return "CommentsQueryDTO{" +
                "classId=" + classId +
                ", commentUser='" + commentUser + '\'' +
                '}';
    }

    public CommentsQueryDTO() {
    }

    public CommentsQueryDTO(@NotNull long classId, String commentUser) {
        this.classId = classId;
        this.commentUser = commentUser;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser;
    }
}

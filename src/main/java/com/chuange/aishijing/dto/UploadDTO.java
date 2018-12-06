package com.chuange.aishijing.dto;

import java.util.Arrays;

/**
 * @author hpy
 * @create 2018/11/27 16:16
 */
public class UploadDTO {
    private long id ;
    private String uploadType ;
    private String uploadName;
    private String uploadSuffixName;
    private String uploadPath;

    @Override
    public String toString() {
        return "UploadDTO{" +
                "id=" + id +
                ", uploadType='" + uploadType + '\'' +
                ", uploadName='" + uploadName + '\'' +
                ", uploadSuffixName='" + uploadSuffixName + '\'' +
                ", uploadPath='" + uploadPath + '\'' +
                '}';
    }

    public UploadDTO(long id, String uploadType, String uploadName, String uploadSuffixName, String uploadPath) {
        this.id = id;
        this.uploadType = uploadType;
        this.uploadName = uploadName;
        this.uploadSuffixName = uploadSuffixName;
        this.uploadPath = uploadPath;
    }

    public UploadDTO() {
    }

    public String getUploadSuffixName() {
        return uploadSuffixName;
    }

    public void setUploadSuffixName(String uploadSuffixName) {
        this.uploadSuffixName = uploadSuffixName;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    public String getUploadName() {
        return uploadName;
    }

    public void setUploadName(String uploadName) {
        this.uploadName = uploadName;
    }

}

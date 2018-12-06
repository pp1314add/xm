package com.chuange.aishijing.dto.classes;

import javax.validation.constraints.NotNull;

/**
 * @author augus
 * @create 2018/11/26 23:12
 */
public class AddSecondClassDTO{
    @NotNull
    private String secondSectionTitle;
    private String courseWareName;
    private String courseWareUrl;
    private String courseVideoUrl;
    private String courseVideoName;

    public AddSecondClassDTO() {
    }

    public AddSecondClassDTO(String secondSectionTitle, String courseWareName, String courseWareUrl, String courseVideoUrl, String courseVideoName) {
        this.secondSectionTitle = secondSectionTitle;
        this.courseWareName = courseWareName;
        this.courseWareUrl = courseWareUrl;
        this.courseVideoUrl = courseVideoUrl;
        this.courseVideoName = courseVideoName;
    }

    @Override
    public String toString() {
        return "AddSecondClassDTO{" +
                "secondSectionTitle='" + secondSectionTitle + '\'' +
                ", courseWareName='" + courseWareName + '\'' +
                ", courseWareUrl='" + courseWareUrl + '\'' +
                ", courseVideoUrl='" + courseVideoUrl + '\'' +
                ", courseVideoName='" + courseVideoName + '\'' +
                '}';
    }

    public String getSecondSectionTitle() {
        return secondSectionTitle;
    }

    public void setSecondSectionTitle(String secondSectionTitle) {
        this.secondSectionTitle = secondSectionTitle;
    }

    public String getCourseWareName() {
        return courseWareName;
    }

    public void setCourseWareName(String courseWareName) {
        this.courseWareName = courseWareName;
    }

    public String getCourseWareUrl() {
        return courseWareUrl;
    }

    public void setCourseWareUrl(String courseWareUrl) {
        this.courseWareUrl = courseWareUrl;
    }

    public String getCourseVideoUrl() {
        return courseVideoUrl;
    }

    public void setCourseVideoUrl(String courseVideoUrl) {
        this.courseVideoUrl = courseVideoUrl;
    }

    public String getCourseVideoName() {
        return courseVideoName;
    }

    public void setCourseVideoName(String courseVideoName) {
        this.courseVideoName = courseVideoName;
    }
}

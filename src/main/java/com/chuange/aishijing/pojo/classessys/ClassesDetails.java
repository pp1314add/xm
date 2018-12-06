package com.chuange.aishijing.pojo.classessys;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 课程详情
 *
 * @author augus
 * @create 2018/11/26 21:59
 */
@Entity
@Table(name="ASJ_CLASSDETAILS")
public class ClassesDetails {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; //自增 id
    private String sectionId; // 章节id
    private String sectionGrade; // 课程等级 （1 大章节 2小章节）
    private String sectionName; // 章节名称
    private String parentId; // 上级章节id
    private String courseWareUrl;// 课件url
    private String courseWareName;// 课件url
    private String courseVideoUrl;// 视频url
    private String courseVideoName;// 视频url
    private String classId; // 课程id


    @Override
    public String toString() {
        return "ClassesDetails{" +
                "id='" + id + '\'' +
                ", sectionId='" + sectionId + '\'' +
                ", sectionGrade='" + sectionGrade + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", courseWareUrl='" + courseWareUrl + '\'' +
                ", courseWareName='" + courseWareName + '\'' +
                ", courseVideoUrl='" + courseVideoUrl + '\'' +
                ", courseVideoName='" + courseVideoName + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }

    public ClassesDetails() {
    }

    public ClassesDetails(String sectionId, String sectionGrade, String sectionName, String parentId, String courseWareUrl, String courseWareName, String courseVideoUrl, String courseVideoName, String classId) {
        this.sectionId = sectionId;
        this.sectionGrade = sectionGrade;
        this.sectionName = sectionName;
        this.parentId = parentId;
        this.courseWareUrl = courseWareUrl;
        this.courseWareName = courseWareName;
        this.courseVideoUrl = courseVideoUrl;
        this.courseVideoName = courseVideoName;
        this.classId = classId;
    }

    public String getCourseWareName() {
        return courseWareName;
    }

    public void setCourseWareName(String courseWareName) {
        this.courseWareName = courseWareName;
    }

    public String getCourseVideoName() {
        return courseVideoName;
    }

    public void setCourseVideoName(String courseVideoName) {
        this.courseVideoName = courseVideoName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionGrade() {
        return sectionGrade;
    }

    public void setSectionGrade(String sectionGrade) {
        this.sectionGrade = sectionGrade;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}

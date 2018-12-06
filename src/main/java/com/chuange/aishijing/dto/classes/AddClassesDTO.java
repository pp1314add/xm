package com.chuange.aishijing.dto.classes;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * 新增课程
 *
 * @author hpy
 * @create 2018/11/26 21:43
 */
public class AddClassesDTO {
    private Long id;
    @NotNull
    private String classtitle;//课程标题（大章节）
    @NotNull
    private String teacher;//讲师
    @NotNull
    private Double price;//价格
    @NotNull
    private String castIntroduce;//课程介绍
    private String classCover; //课程封面url
    @NotNull
    private String castTitle ;
    @NotNull
    private List<AddFirstClassesDTO> firstClasses = new ArrayList<AddFirstClassesDTO>();

    @Override
    public String toString() {
        return "AddClassesDTO{" +
                "classtitle='" + classtitle + '\'' +
                ", teacher='" + teacher + '\'' +
                ", price=" + price +
                ", castIntroduce='" + castIntroduce + '\'' +
                ", classCover='" + classCover + '\'' +
                ", castTitle='" + castTitle + '\'' +
                ", firstClasses=" + firstClasses +
                '}';
    }

    public AddClassesDTO() {
    }

    public AddClassesDTO(@NotNull String classtitle, @NotNull String teacher, @NotNull Double price, @NotNull String castIntroduce, String classCover, @NotNull String castTitle, @NotNull List<AddFirstClassesDTO> firstClasses) {
        this.classtitle = classtitle;
        this.teacher = teacher;
        this.price = price;
        this.castIntroduce = castIntroduce;
        this.classCover = classCover;
        this.castTitle = castTitle;
        this.firstClasses = firstClasses;
    }

    public void addFirstClasses(AddFirstClassesDTO addFirstClassesDTO){
        if(firstClasses ==null){
            firstClasses = new ArrayList<AddFirstClassesDTO>();
        }
        firstClasses.add(addFirstClassesDTO);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassCover() {
        return classCover;
    }

    public void setClassCover(String classCover) {
        this.classCover = classCover;
    }

    public String getCastTitle() {
        return castTitle;
    }

    public void setCastTitle(String castTitle) {
        this.castTitle = castTitle;
    }

    public String getClasstitle() {
        return classtitle;
    }

    public void setClasstitle(String classtitle) {
        this.classtitle = classtitle;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCastIntroduce() {
        return castIntroduce;
    }

    public void setCastIntroduce(String castIntroduce) {
        this.castIntroduce = castIntroduce;
    }

    public List<AddFirstClassesDTO> getFirstClasses() {
        return firstClasses;
    }

    public void setFirstClasses(List<AddFirstClassesDTO> firstClasses) {
        this.firstClasses = firstClasses;
    }



}

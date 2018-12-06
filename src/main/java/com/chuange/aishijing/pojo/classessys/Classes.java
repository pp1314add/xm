package com.chuange.aishijing.pojo.classessys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 课程表
 */
@Entity
@Table(name="ASJ_CLASSES")
public class Classes {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String teacher;//讲师
	private String classCover;//课程封面
	private Double price;//价格
	private String castIntroduce;//课程介绍
	private String castTitle;

	@Override
	public String toString() {
		return "Classes{" +
				"id='" + id + '\'' +
				", teacher='" + teacher + '\'' +
				", classCover='" + classCover + '\'' +
				", price=" + price +
				", castIntroduce='" + castIntroduce + '\'' +
				", castTitle='" + castTitle + '\'' +
				'}';
	}

	public Classes() {
	}

	public Classes(String teacher, String classCover, Double price, String castIntroduce, String castTitle) {
		this.teacher = teacher;
		this.classCover = classCover;
		this.price = price;
		this.castIntroduce = castIntroduce;
		this.castTitle = castTitle;
	}

	public String getCastTitle() {
		return castTitle;
	}

	public void setCastTitle(String castTitle) {
		this.castTitle = castTitle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getClassCover() {
		return classCover;
	}

	public void setClassCover(String classCover) {
		this.classCover = classCover;
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
}

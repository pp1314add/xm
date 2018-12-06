package com.chuange.aishijing.pojo.castmanage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author yuany
 * 剧组表
 */
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="ASJ_CAST")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Cast {
	@Id
    @NotNull
	@GeneratedValue(generator="system_uuid")
	@GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String castname;//剧组名称
	private String castLogo;//剧组logo
	private String castType;//剧组类型
	private String shootingPlace;//拍摄地点
	private String director;//导演
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date buildTime;//建组时间
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startTime;//开机时间
	private String companyName;//公司名称
	private String licenseNum;//营业执证号
	private String contacts;//联系人
	private String contactsTel;//联系人电话
	private String contactsEmail;//联系人邮箱
	private String licenseImg;//营业执照
	private String comcontacts;//公司联系人
	private String comcontactsTel;//公司联系人电话
	private String comcontactsEmail;//公司邮箱
	public Cast(){}

	public Cast(String castname, String castLogo, String castType, String shootingPlace, String director, Date buildTime, Date startTime, String companyName, String licenseNum, String contacts, String contactsTel, String contactsEmail, String licenseImg, String comcontacts, String comcontactsTel, String comcontactsEmail) {
		this.castname = castname;
		this.castLogo = castLogo;
		this.castType = castType;
		this.shootingPlace = shootingPlace;
		this.director = director;
		this.buildTime = buildTime;
		this.startTime = startTime;
		this.companyName = companyName;
		this.licenseNum = licenseNum;
		this.contacts = contacts;
		this.contactsTel = contactsTel;
		this.contactsEmail = contactsEmail;
		this.licenseImg = licenseImg;
		this.comcontacts = comcontacts;
		this.comcontactsTel = comcontactsTel;
		this.comcontactsEmail = comcontactsEmail;
	}

	@Override
	public String toString() {
		return "Cast{" +
				"id='" + id + '\'' +
				", castname='" + castname + '\'' +
				", castLogo='" + castLogo + '\'' +
				", castType='" + castType + '\'' +
				", shootingPlace='" + shootingPlace + '\'' +
				", director='" + director + '\'' +
				", buildTime=" + buildTime +
				", startTime=" + startTime +
				", companyName='" + companyName + '\'' +
				", licenseNum='" + licenseNum + '\'' +
				", contacts='" + contacts + '\'' +
				", contactsTel='" + contactsTel + '\'' +
				", contactsEmail='" + contactsEmail + '\'' +
				", licenseImg='" + licenseImg + '\'' +
				", comcontacts='" + comcontacts + '\'' +
				", comcontactsTel='" + comcontactsTel + '\'' +
				", comcontactsEmail='" + comcontactsEmail + '\'' +
				'}';
	}

	public String getComcontacts() {
		return comcontacts;
	}

	public void setComcontacts(String comcontacts) {
		this.comcontacts = comcontacts;
	}

	public String getComcontactsTel() {
		return comcontactsTel;
	}

	public void setComcontactsTel(String comcontactsTel) {
		this.comcontactsTel = comcontactsTel;
	}

	public String getComcontactsEmail() {
		return comcontactsEmail;
	}

	public void setComcontactsEmail(String comcontactsEmail) {
		this.comcontactsEmail = comcontactsEmail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCastname() {
		return castname;
	}

	public void setCastname(String castname) {
		this.castname = castname;
	}

	public String getCastLogo() {
		return castLogo;
	}

	public void setCastLogo(String castLogo) {
		this.castLogo = castLogo;
	}

	public String getCastType() {
		return castType;
	}

	public void setCastType(String castType) {
		this.castType = castType;
	}

	public String getShootingPlace() {
		return shootingPlace;
	}

	public void setShootingPlace(String shootingPlace) {
		this.shootingPlace = shootingPlace;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(Date buildTime) {
		this.buildTime = buildTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getContactsTel() {
		return contactsTel;
	}

	public void setContactsTel(String contactsTel) {
		this.contactsTel = contactsTel;
	}

	public String getContactsEmail() {
		return contactsEmail;
	}

	public void setContactsEmail(String contactsEmail) {
		this.contactsEmail = contactsEmail;
	}

	public String getLicenseImg() {
		return licenseImg;
	}

	public void setLicenseImg(String licenseImg) {
		this.licenseImg = licenseImg;
	}
}

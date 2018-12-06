package com.chuange.aishijing.vo.servicevo.CastManagervo;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-16.
 */
public class AddCastManagerResponse{
    private String editId;
    private String castname;
    private String casttype;
    private String shootingplace;
    private String director;
    private Date buildtime;
    private Date starttime;
    private String contacts;
    private String contactstel;
    private String contactsemail;
    private String logo;
    private String companyname;
    private String licenseNum;
    private String comcontacts;
    private String comcontactstel;
    private String comcontactemail;
    private String licenseImg;
    public AddCastManagerResponse(){}

    public AddCastManagerResponse(String editId, String castname, String casttype, String shootingplace, String director, Date buildtime, Date starttime, String contacts, String contactstel, String contactsemail, String logo, String companyname, String licenseNum, String comcontacts, String comcontactstel, String comcontactemail, String licenseImg) {
        this.editId = editId;
        this.castname = castname;
        this.casttype = casttype;
        this.shootingplace = shootingplace;
        this.director = director;
        this.buildtime = buildtime;
        this.starttime = starttime;
        this.contacts = contacts;
        this.contactstel = contactstel;
        this.contactsemail = contactsemail;
        this.logo = logo;
        this.companyname = companyname;
        this.licenseNum = licenseNum;
        this.comcontacts = comcontacts;
        this.comcontactstel = comcontactstel;
        this.comcontactemail = comcontactemail;
        this.licenseImg = licenseImg;
    }

    public String getEditId() {
        return editId;
    }

    public void setEditId(String editId) {
        this.editId = editId;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getCastname() {
        return castname;
    }

    public void setCastname(String castname) {
        this.castname = castname;
    }

    public String getCasttype() {
        return casttype;
    }

    public void setCasttype(String casttype) {
        this.casttype = casttype;
    }

    public String getShootingplace() {
        return shootingplace;
    }

    public void setShootingplace(String shootingplace) {
        this.shootingplace = shootingplace;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactstel() {
        return contactstel;
    }

    public void setContactstel(String contactstel) {
        this.contactstel = contactstel;
    }

    public String getContactsemail() {
        return contactsemail;
    }

    public void setContactsemail(String contactsemail) {
        this.contactsemail = contactsemail;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getComcontacts() {
        return comcontacts;
    }

    public void setComcontacts(String comcontacts) {
        this.comcontacts = comcontacts;
    }

    public String getComcontactstel() {
        return comcontactstel;
    }

    public void setComcontactstel(String comcontactstel) {
        this.comcontactstel = comcontactstel;
    }

    public String getComcontactemail() {
        return comcontactemail;
    }

    public void setComcontactemail(String comcontactemail) {
        this.comcontactemail = comcontactemail;
    }

    public String getLicenseImg() {
        return licenseImg;
    }

    public void setLicenseImg(String licenseImg) {
        this.licenseImg = licenseImg;
    }
}

package com.chuange.aishijing.pojo.castmanage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-15.
 */
@Entity
@Table(name="ASJ_CASTMEMBER")
public class CastMember {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String castid;//所属剧组id
    private String memberName;//成员名称
    private String memberTel;//联系电话
    private String memberEmail;//联系邮箱
    private String memberPositions;//成员职位
    private String userid;//关联用户id

    public CastMember(){}

    public CastMember(String castid, String memberName, String memberTel, String memberEmail, String memberPositions, String userid) {
        this.castid = castid;
        this.memberName = memberName;
        this.memberTel = memberTel;
        this.memberEmail = memberEmail;
        this.memberPositions = memberPositions;
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "CastMember{" +
                "id='" + id + '\'' +
                ", castid='" + castid + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberTel='" + memberTel + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPositions='" + memberPositions + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCastid() {
        return castid;
    }

    public void setCastid(String castid) {
        this.castid = castid;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPositions() {
        return memberPositions;
    }

    public void setMemberPositions(String memberPositions) {
        this.memberPositions = memberPositions;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}

package com.chuange.aishijing.pojo.teachersys;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 教师收益
 */
@Entity
@Table(name="ASJ_TEACHERPROFIT")
public class TeacherProfit {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String profitAdd;//收益增加
    private Date profitTime;//收益时间
    private String couponDeduction;//优惠券抵扣
    private String platformDivision;//平台分成
    private String paid;//实收
    private String profitContent;//收益内容

    @Override
    public String toString() {
        return "TeacherProfit{" +
                "id='" + id + '\'' +
                ", profitAdd='" + profitAdd + '\'' +
                ", profitTime=" + profitTime +
                ", couponDeduction='" + couponDeduction + '\'' +
                ", platformDivision='" + platformDivision + '\'' +
                ", paid='" + paid + '\'' +
                ", profitContent='" + profitContent + '\'' +
                '}';
    }

    public TeacherProfit(String profitAdd, Date profitTime, String couponDeduction, String platformDivision, String paid, String profitContent) {
        this.profitAdd = profitAdd;
        this.profitTime = profitTime;
        this.couponDeduction = couponDeduction;
        this.platformDivision = platformDivision;
        this.paid = paid;
        this.profitContent = profitContent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfitAdd() {
        return profitAdd;
    }

    public void setProfitAdd(String profitAdd) {
        this.profitAdd = profitAdd;
    }

    public Date getProfitTime() {
        return profitTime;
    }

    public void setProfitTime(Date profitTime) {
        this.profitTime = profitTime;
    }

    public String getCouponDeduction() {
        return couponDeduction;
    }

    public void setCouponDeduction(String couponDeduction) {
        this.couponDeduction = couponDeduction;
    }

    public String getPlatformDivision() {
        return platformDivision;
    }

    public void setPlatformDivision(String platformDivision) {
        this.platformDivision = platformDivision;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getProfitContent() {
        return profitContent;
    }

    public void setProfitContent(String profitContent) {
        this.profitContent = profitContent;
    }
}

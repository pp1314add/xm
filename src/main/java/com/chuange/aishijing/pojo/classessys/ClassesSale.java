package com.chuange.aishijing.pojo.classessys;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 课程销售相关
 *
 * @author augus
 * @create 2018/11/26 22:50
 */
@Entity
@Table(name="ASJ_CLASSESSALE")
public class ClassesSale {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Double score;//评分
    private Double totalPrice;//累计收益
    private Double discount;//优惠券抵扣
    private Double realIncome;//实际收入
    private Double appIncome;//平台抽成
    private Integer buyNum;//购买人数
    private long classesId;
    private Integer playNum;//播放次数

    @Override
    public String toString() {
        return "ClassesSale{" +
                "id='" + id + '\'' +
                ", score=" + score +
                ", totalPrice=" + totalPrice +
                ", discount=" + discount +
                ", realIncome=" + realIncome +
                ", appIncome=" + appIncome +
                ", buyNum=" + buyNum +
                ", classesId='" + classesId + '\'' +
                ", playNum=" + playNum +
                '}';
    }

    public ClassesSale(Double score, Double totalPrice, Double discount, Double realIncome, Double appIncome, Integer buyNum, long classesId, Integer playNum) {
        this.score = score;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.realIncome = realIncome;
        this.appIncome = appIncome;
        this.buyNum = buyNum;
        this.classesId = classesId;
        this.playNum = playNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClassesSale() {
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(Double realIncome) {
        this.realIncome = realIncome;
    }

    public Double getAppIncome() {
        return appIncome;
    }

    public void setAppIncome(Double appIncome) {
        this.appIncome = appIncome;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public long getClassesId() {
        return classesId;
    }

    public void setClassesId(long classesId) {
        this.classesId = classesId;
    }

    public Integer getPlayNum() {
        return playNum;
    }

    public void setPlayNum(Integer playNum) {
        this.playNum = playNum;
    }
}

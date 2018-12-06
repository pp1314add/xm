package com.chuange.aishijing.pojo.ordermanage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-07.
 * 全部订单
 */
@Entity
@Table(name="ASJ_ORDER")
public class Order {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String orderMarking;//订单编号
    private String purchaser;//购买人
    private String purchaserTel;//购买人手机号
    private String className;//课程名称
    private String lecturer;//讲师
    private String orderAmount;//订单金额
    private String coupondeductionAmount;//优惠券抵扣金额
    private String userpaidAmount;//用户实付金额
    private String paymentMethod;//支付方式
    private String paymentOrder;//支付单号

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderMarking='" + orderMarking + '\'' +
                ", purchaser='" + purchaser + '\'' +
                ", purchaserTel='" + purchaserTel + '\'' +
                ", className='" + className + '\'' +
                ", lecturer='" + lecturer + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", coupondeductionAmount='" + coupondeductionAmount + '\'' +
                ", userpaidAmount='" + userpaidAmount + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentOrder='" + paymentOrder + '\'' +
                '}';
    }

    public Order(String orderMarking, String purchaser, String purchaserTel, String className, String lecturer, String orderAmount, String coupondeductionAmount, String userpaidAmount, String paymentMethod, String paymentOrder) {
        this.orderMarking = orderMarking;
        this.purchaser = purchaser;
        this.purchaserTel = purchaserTel;
        this.className = className;
        this.lecturer = lecturer;
        this.orderAmount = orderAmount;
        this.coupondeductionAmount = coupondeductionAmount;
        this.userpaidAmount = userpaidAmount;
        this.paymentMethod = paymentMethod;
        this.paymentOrder = paymentOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderMarking() {
        return orderMarking;
    }

    public void setOrderMarking(String orderMarking) {
        this.orderMarking = orderMarking;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getPurchaserTel() {
        return purchaserTel;
    }

    public void setPurchaserTel(String purchaserTel) {
        this.purchaserTel = purchaserTel;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCoupondeductionAmount() {
        return coupondeductionAmount;
    }

    public void setCoupondeductionAmount(String coupondeductionAmount) {
        this.coupondeductionAmount = coupondeductionAmount;
    }

    public String getUserpaidAmount() {
        return userpaidAmount;
    }

    public void setUserpaidAmount(String userpaidAmount) {
        this.userpaidAmount = userpaidAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentOrder() {
        return paymentOrder;
    }

    public void setPaymentOrder(String paymentOrder) {
        this.paymentOrder = paymentOrder;
    }
}


package com.chuange.aishijing.pojo.sysmanage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 系统日志
 */
@Entity
@Table(name="ASJ_SYSTEMLOG")
public class SystemLog {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String operator;//操作者
    private String operatorIp;//操作者ip
    private Date operatorTime;//操作时间
    private String operatorContent;//操作内容

    @Override
    public String toString() {
        return "SystemLog{" +
                "id='" + id + '\'' +
                ", operator='" + operator + '\'' +
                ", operatorIp='" + operatorIp + '\'' +
                ", operatorTime=" + operatorTime +
                ", operatorContent='" + operatorContent + '\'' +
                '}';
    }

    public SystemLog(String operator, String operatorIp, Date operatorTime, String operatorContent) {
        this.operator = operator;
        this.operatorIp = operatorIp;
        this.operatorTime = operatorTime;
        this.operatorContent = operatorContent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorContent() {
        return operatorContent;
    }

    public void setOperatorContent(String operatorContent) {
        this.operatorContent = operatorContent;
    }
}

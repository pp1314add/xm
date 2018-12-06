package com.chuange.aishijing.dto.classes;

import javax.validation.constraints.NotNull;

/**
 * @author augus
 * @create 2018/11/27 12:16
 */
public class OrderQueryDTO {
    @NotNull
    private long classId;// classid
    private String purchaser ;

    public OrderQueryDTO() {
    }

    @Override
    public String toString() {
        return "OrderQueryDTO{" +
                "classId=" + classId +
                ", purchaser='" + purchaser + '\'' +
                '}';
    }

    public OrderQueryDTO(@NotNull long classId, String purchaser) {
        this.classId = classId;
        this.purchaser = purchaser;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }
}

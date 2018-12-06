package com.chuange.aishijing.vo.servicevo.classesmanage;

import com.chuange.aishijing.dto.classes.AddClassesDTO;
import com.chuange.aishijing.pojo.classessys.ClassesSale;
import com.chuange.aishijing.pojo.ordermanage.Order;
import com.chuange.aishijing.vo.CommonResponseVO;

import java.util.List;

/**
 * @author augus
 * @create 2018/11/26 22:32
 */
public class CouseVO extends CommonResponseVO{
    private AddClassesDTO addClassesDTO ;
    private ClassesSale classesSale;
    private List<Order> orderList;

    @Override
    public String toString() {
        return "CouseVO{" +
                "addClassesDTO=" + addClassesDTO +
                ", classesSale=" + classesSale +
                ", orderList=" + orderList +
                '}';
    }

    public CouseVO(AddClassesDTO addClassesDTO, ClassesSale classesSale, List<Order> orderList) {
        this.addClassesDTO = addClassesDTO;
        this.classesSale = classesSale;
        this.orderList = orderList;
    }

    public CouseVO() {
    }

    public CouseVO(String code, String msg, String hash, Object data) {
        super(code, msg, hash, data);
    }

    public CouseVO(String code, String msg) {
        super(code, msg);
    }

    public AddClassesDTO getAddClassesDTO() {
        return addClassesDTO;
    }

    public void setAddClassesDTO(AddClassesDTO addClassesDTO) {
        this.addClassesDTO = addClassesDTO;
    }

    public ClassesSale getClassesSale() {
        return classesSale;
    }

    public void setClassesSale(ClassesSale classesSale) {
        this.classesSale = classesSale;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}

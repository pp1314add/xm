package com.chuange.aishijing.vo.servicevo.checksystemvo;

import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.chuange.aishijing.pojo.checkSystem.Certification;
import com.chuange.aishijing.pojo.checkSystem.StarCertified;

import java.util.List;

/**
 * Created by Administrator on 2018-11-13.
 */
public class CheckSystemResponse {

    private List<Certification> list;
    private List<StarCertified> starList;
    private List<CastCertified> castCertifiedList;
    private int totalPage;
    private Long totalElements;
    public CheckSystemResponse(){};


    public CheckSystemResponse(List<Certification> list, List<StarCertified> starList, List<CastCertified> castCertifiedList, int totalPage, Long totalElements) {
        this.list = list;
        this.starList = starList;
        this.castCertifiedList = castCertifiedList;
        this.totalPage = totalPage;
        this.totalElements = totalElements;
    }

    public List<StarCertified> getStarList() {
        return starList;
    }

    public void setStarList(List<StarCertified> starList) {
        this.starList = starList;
    }

    public List<CastCertified> getCastCertifiedList() {
        return castCertifiedList;
    }

    public void setCastCertifiedList(List<CastCertified> castCertifiedList) {
        this.castCertifiedList = castCertifiedList;
    }

    public List<Certification> getList() {
        return list;
    }

    public void setList(List<Certification> list) {
        this.list = list;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }
}

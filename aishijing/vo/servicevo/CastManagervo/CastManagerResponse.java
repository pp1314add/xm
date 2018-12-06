package com.chuange.aishijing.vo.servicevo.CastManagervo;

import com.chuange.aishijing.pojo.castmanage.Cast;

import java.util.List;

/**
 * Created by Administrator on 2018-11-15.
 */
public class CastManagerResponse {
    private List<Cast> castList;
    private int totalPage;
    private Long totalElements;

    public CastManagerResponse(){}

    public CastManagerResponse(List<Cast> castList, int totalPage, Long totalElements) {
        this.castList = castList;
        this.totalPage = totalPage;
        this.totalElements = totalElements;
    }

    @Override
    public String toString() {
        return "CastManagerResponse{" +
                "castList=" + castList +
                ", totalPage=" + totalPage +
                ", totalElements=" + totalElements +
                '}';
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
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

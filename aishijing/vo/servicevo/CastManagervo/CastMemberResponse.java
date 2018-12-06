package com.chuange.aishijing.vo.servicevo.CastManagervo;

import com.chuange.aishijing.pojo.castmanage.CastMember;

import java.util.List;

/**
 * Created by Administrator on 2018-11-20.
 */
public class CastMemberResponse {
    private List<CastMember> castMemberList;
    private int totalPage;
    private Long totalElements;

    public CastMemberResponse(){}

    public CastMemberResponse(List<CastMember> castMemberList, int totalPage, Long totalElements) {
        this.castMemberList = castMemberList;
        this.totalPage = totalPage;
        this.totalElements = totalElements;
    }

    public List<CastMember> getCastMemberList() {
        return castMemberList;
    }

    public void setCastMemberList(List<CastMember> castMemberList) {
        this.castMemberList = castMemberList;
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

    @Override
    public String toString() {
        return "CastMemberResponse{" +
                "castMemberList=" + castMemberList +
                ", totalPage=" + totalPage +
                ", totalElements=" + totalElements +
                '}';
    }
}

package com.chuange.aishijing.service;

import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.castmanage.CastMember;
import com.chuange.aishijing.vo.servicevo.CastManagervo.AddCastManagerResponse;
import org.springframework.data.domain.Page;

/**
 * Created by Administrator on 2018-11-15.
 */
public interface CastManagerService {
    Page<Cast> seletCast(Integer page,String key);
    Page<CastMember> seletCastMember(Integer page, String key,String castId);
    int insertorupdateCast(AddCastManagerResponse addCastManagerResponse);
    int insertorupdateCastMember(CastMember castMember);
    int deleteCast(String delId);
    int deleteCastMember(String delId);
    Cast findCastById(String editId);
    int updateCast(AddCastManagerResponse addCastManagerResponse);
}

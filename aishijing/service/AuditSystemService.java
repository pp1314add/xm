package com.chuange.aishijing.service;

import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.chuange.aishijing.pojo.checkSystem.Certification;
import com.chuange.aishijing.pojo.checkSystem.StarCertified;
import com.chuange.aishijing.vo.servicevo.checksystemvo.CheckSystemResponseVO;
import org.springframework.data.domain.Page;

/**
 * Created by Administrator on 2018-11-12.
 */
public interface AuditSystemService {
    Page<Certification> selectAll(Integer page, String key,String key1);
    CheckSystemResponseVO updateStatus(String id,String flag);
    Page<StarCertified> selectStarAll(Integer page, String key,String key1);
    CheckSystemResponseVO updateStarStatus(String id,String flag);
    Page<CastCertified> selectCastAll(Integer page, String key,String key1);
    CheckSystemResponseVO updateCastStatus(String id,String flag);
}

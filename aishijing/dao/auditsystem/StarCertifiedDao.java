package com.chuange.aishijing.dao.auditsystem;

import com.chuange.aishijing.pojo.checkSystem.StarCertified;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Administrator on 2018-11-14.
 */
public interface StarCertifiedDao extends JpaRepository<StarCertified,String>,JpaSpecificationExecutor<StarCertified> {
    @Override
    List<StarCertified> findAll();

    @Modifying
    @Query(value = "update asj_starcertified a set a.handle_status =:status where a.id=:id", nativeQuery=true)
    int modifyStatus(@Param("id") String id, @Param("status") String status);

    @Query(value = "select a.handle_status from asj_starcertified a where a.id=:id", nativeQuery=true)
    String findStatus(@Param("id") String id);
}

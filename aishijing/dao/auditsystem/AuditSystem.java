package com.chuange.aishijing.dao.auditsystem;

import com.chuange.aishijing.pojo.checkSystem.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Administrator on 2018-11-12.
 */
public interface AuditSystem extends JpaRepository<Certification,String>,JpaSpecificationExecutor<Certification> {
    @Override
    List<Certification> findAll();

    @Modifying
    @Query(value = "update asj_certification a set a.status =:status where a.id=:id", nativeQuery=true)
    int modifyStatus(@Param("id") String id,@Param("status") String status);

    @Query(value = "select a.status from asj_certification a where a.id=:id", nativeQuery=true)
    String findStatus(@Param("id") String id);


}

package com.chuange.aishijing.dao.castmanager;

import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2018-11-15.
 */
public interface CastManagerDao extends JpaRepository<Cast,String>,JpaSpecificationExecutor<Cast> {

    Cast getOne(String id);

}

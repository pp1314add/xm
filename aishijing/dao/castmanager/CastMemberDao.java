package com.chuange.aishijing.dao.castmanager;

import com.chuange.aishijing.pojo.castmanage.CastMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-11-20.
 */
public interface CastMemberDao extends JpaRepository<CastMember,String>,JpaSpecificationExecutor<CastMember> {


}

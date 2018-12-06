package com.chuange.aishijing.dao.castmanager;

import com.chuange.aishijing.pojo.teachersys.TeacherManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-11-21.
 */
public interface TeacherManagerDao extends JpaRepository<TeacherManager,String>,JpaSpecificationExecutor<TeacherManager> {
}

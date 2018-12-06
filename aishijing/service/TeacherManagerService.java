package com.chuange.aishijing.service;

import com.chuange.aishijing.pojo.teachersys.TeacherManager;
import org.springframework.data.domain.Page;

/**
 * Created by Administrator on 2018-11-21.
 */
public interface TeacherManagerService {
    Page<TeacherManager> selectTeacher(Integer page,String key);
    int insertorupdateTeacher(TeacherManager teacherManager);
    TeacherManager findTeacherById(String id);
    void deleteTeacherById(String id);
}

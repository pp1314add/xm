package com.chuange.aishijing.controller.CastManager;

import com.chuange.aishijing.pojo.teachersys.TeacherManager;
import com.chuange.aishijing.service.TeacherManagerService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.CastManagervo.TeacherManagerResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-11-21.
 */
@RestController
public class TeacherManagerController {
    @Autowired
    private TeacherManagerService teacherManagerService;

    @ResponseBody
    @RequestMapping("/selectteacher")
    public TeacherManagerResponseVO selectteacher(@RequestParam Integer page,@RequestParam(required = false) String key){
        TeacherManagerResponseVO teacherManagerResponseVO = new TeacherManagerResponseVO();
        Page<TeacherManager> teacherManagers = teacherManagerService.selectTeacher(page,key);
        teacherManagerResponseVO.success("查询成功",new MD5(teacherManagerResponseVO.toString()).compute(),teacherManagers);
        return teacherManagerResponseVO;
    }
    @ResponseBody
    @RequestMapping("/insertorupdateteacher")
    public TeacherManagerResponseVO insertteacher(@RequestBody TeacherManager teacherManager){
        System.out.println("编辑");
        TeacherManagerResponseVO teacherManagerResponseVO = new TeacherManagerResponseVO();
        int s = teacherManagerService.insertorupdateTeacher(teacherManager);
        if (s==1){
            teacherManagerResponseVO.success("success");
        }else{
            teacherManagerResponseVO.fail("fail");
        }
        return teacherManagerResponseVO;
    }
    @ResponseBody
    @RequestMapping("/findteacherById")
    public TeacherManager findteacherById(@RequestParam String id){
        TeacherManager teacherManager = teacherManagerService.findTeacherById(id);
        return teacherManager;
    }
    @ResponseBody
    @RequestMapping("/deleteteacherById")
    public TeacherManagerResponseVO deleteteacherById(@RequestParam String id){
        TeacherManagerResponseVO teacherManager = new TeacherManagerResponseVO();
        teacherManagerService.deleteTeacherById(id);
        teacherManager.success("success");
        return teacherManager;
    }

}

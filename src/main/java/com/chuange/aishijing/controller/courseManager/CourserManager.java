package com.chuange.aishijing.controller.courseManager;

import com.chuange.aishijing.dto.classes.AddClassesDTO;
import com.chuange.aishijing.dto.classes.CommentsQueryDTO;
import com.chuange.aishijing.dto.classes.OrderQueryDTO;
import com.chuange.aishijing.pojo.classessys.ClassComments;
import com.chuange.aishijing.pojo.classessys.ClassesSale;
import com.chuange.aishijing.pojo.ordermanage.Order;
import com.chuange.aishijing.service.CourserManagerService;
import com.chuange.aishijing.vo.CommonResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 课程管理
 *
 * @author hpy
 * @create 2018/11/26
 */
@RestController()
@ComponentScan
@RequestMapping("/course")
public class CourserManager {

    @Autowired
    private CourserManagerService courserManagerService;

    private static String OK = "200";
    private static String ERROR = "500";
    /**
     * 添加课程 基本信息
     * @return
     */
    @RequestMapping(value = "/addClasses" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public CommonResponseVO addClasses(@RequestBody AddClassesDTO addClassesDTO){
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        boolean result = false;
        try {
            result = courserManagerService.addClasses(addClassesDTO);
        }catch (Exception e){
            e.printStackTrace();
            result = false;
        }
        if(result){
            commonResponseVO.setCode(OK);
        }else{
            commonResponseVO.setCode(ERROR);
        }
        return commonResponseVO;
    }


    /**
     * 获取课程基本信息和章节信息
     * @return
     */
    @RequestMapping(value = "/getClassesByid/{classid}" ,method = RequestMethod.GET)
    public CommonResponseVO getClassesByid(@PathVariable  long classid){
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        AddClassesDTO addClassesDTO  = courserManagerService.getClasses(classid);
        commonResponseVO.setCode(OK);
        commonResponseVO.setData(addClassesDTO);
        return commonResponseVO;
    }


    /**
     * 获取课程销售信息
     * @return
     */
    @RequestMapping(value = "/getClassesSaleByid/{classid}" ,method = RequestMethod.GET)
    public CommonResponseVO getClassesSaleByid(@PathVariable  long classid){
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        ClassesSale classesSale  = courserManagerService.getClassesSale(classid);
        commonResponseVO.setCode(OK);
        commonResponseVO.setData(classesSale);
        return commonResponseVO;
    }


    /**
     * 获取课程销售信息
     * @return
     */
    @RequestMapping(value = "/getClassesOrderByid/{classid}" ,method = RequestMethod.GET)
    public CommonResponseVO getClassesOrderByid(@PathVariable  long classid){
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        List<Order> classesSaleList  = courserManagerService.getClassesOrder(classid);
        commonResponseVO.setCode(OK);
        commonResponseVO.setData(classesSaleList);
        return commonResponseVO;
    }


    /**
     * 获取课程销售信息
     * @return
     */
    @RequestMapping(value = "/getClassesOrderByidAndOtherQuery" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public CommonResponseVO getClassesOrderByidAndOtherQuery(@RequestBody OrderQueryDTO orderQueryDTO){
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        List<Order> classesSaleList  = courserManagerService.getClassesOrderByOtherQuery(orderQueryDTO);
        commonResponseVO.setCode(OK);
        commonResponseVO.setData(classesSaleList);
        return commonResponseVO;
    }


    /**
     * 获取课程基本信息
     * @return
     */
    @RequestMapping(value = "/getBaseClassList" ,method = RequestMethod.GET)
    public CommonResponseVO getBaseClassList(){
        List<AddClassesDTO> getAllList  = courserManagerService.getClassesIdList();
        CommonResponseVO couseVO = new CommonResponseVO();
        couseVO.setCode(OK);
        couseVO.setData(getAllList);
        return couseVO;
    }

    /**
     * 获取 课程 评价列表
     * @return
     */
    @RequestMapping(value = "/getCommentsList/{classid}" ,method = RequestMethod.GET)
    public CommonResponseVO getCommentsList(@PathVariable  long classid){
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        List<ClassComments> classComments  = courserManagerService.getComments(classid);
        commonResponseVO.setCode(OK);
        commonResponseVO.setData(classComments);
        return commonResponseVO;
    }

    /**
     * 获取 课程 评价列表
     * @return
     */
    @RequestMapping(value = "/getCommentsListByidAndOtherQuery" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public CommonResponseVO getCommentsListByidAndOtherQuery(@RequestBody CommentsQueryDTO commentsQueryDTO){
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        List<ClassComments> classComments  = courserManagerService.getCommentsByOtherQuery(commentsQueryDTO);
        commonResponseVO.setCode(OK);
        commonResponseVO.setData(classComments);
        return commonResponseVO;
    }



    @RequestMapping(value = "/delCommentsByCommentId/{classid}" ,method = RequestMethod.DELETE)
    public CommonResponseVO delCommentsByCommentId(long  commentId){
        boolean result = false;
        CommonResponseVO commonResponseVO = new CommonResponseVO();
        try {
            result = courserManagerService.delCommentByCommentId(commentId);
        }catch ( Exception e){
            result = false;
        }
        if(result){
            commonResponseVO.setCode(OK);
        }else {
            commonResponseVO.setCode(ERROR);
        }

        return commonResponseVO;
    }





}

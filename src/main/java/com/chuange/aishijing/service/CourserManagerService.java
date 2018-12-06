package com.chuange.aishijing.service;

import com.chuange.aishijing.dao.courserManager.ClassesCommentsDao;
import com.chuange.aishijing.dto.classes.AddClassesDTO;
import com.chuange.aishijing.dto.classes.CommentsQueryDTO;
import com.chuange.aishijing.dto.classes.OrderQueryDTO;
import com.chuange.aishijing.pojo.classessys.ClassComments;
import com.chuange.aishijing.pojo.classessys.ClassesSale;
import com.chuange.aishijing.pojo.ordermanage.Order;
import com.chuange.aishijing.vo.servicevo.classesmanage.CouseVO;

import java.util.List;

/**
 * 课程管理接口
 */
public interface CourserManagerService {


    /**
     * 添加 课程
     * @param addClassesDTO
     * @return
     */
    public boolean addClasses(AddClassesDTO addClassesDTO) throws Exception;


    /**
     * 根据课程id 获取课程
     * @param classId
     * @return
     */
    public AddClassesDTO getClasses(long classId);


    /**
     * 获取 课程 基本信息价格栏目
     * @param classId
     * @return
     */
    public ClassesSale getClassesSale(long  classId);

    /**
     * 获取课程的销售情况
     * @param classId
     * @return
     */
    public List<Order> getClassesOrder(long classId) ;
    /**
     * 获取课程的销售情况 其他操作
     * @param orderQueryDTO
     * @return
     */
    public List<Order> getClassesOrderByOtherQuery(OrderQueryDTO orderQueryDTO);


    /**
     * 获取课程基本信息列表list
     * @return
     */
    public List<AddClassesDTO> getClassesIdList();

    /**
     * 根据 classid 获取评价列表
     * @param classid
     * @return
     */
    public List<ClassComments>  getComments(long classid);


    /**
     * 根据 classid 获取评价列表  其他操作
     * @param commentsQueryDTO
     * @return
     */
    public List<ClassComments>  getCommentsByOtherQuery(CommentsQueryDTO commentsQueryDTO);


    /**
     * 删除评价
     * @param commentid
     * @return
     */
    public boolean delCommentByCommentId(long commentid) throws Exception;


}

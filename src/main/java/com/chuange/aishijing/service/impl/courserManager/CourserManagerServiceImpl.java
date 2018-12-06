package com.chuange.aishijing.service.impl.courserManager;

import com.chuange.aishijing.dao.courserManager.ClassesCommentsDao;
import com.chuange.aishijing.dao.courserManager.ClassesDao;
import com.chuange.aishijing.dao.courserManager.ClassesDetailsDao;
import com.chuange.aishijing.dao.courserManager.ClassesSaleDao;
import com.chuange.aishijing.dao.orderManager.OrderDao;
import com.chuange.aishijing.dto.classes.*;
import com.chuange.aishijing.pojo.classessys.ClassComments;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.classessys.ClassesDetails;
import com.chuange.aishijing.pojo.classessys.ClassesSale;
import com.chuange.aishijing.pojo.ordermanage.Order;
import com.chuange.aishijing.service.CourserManagerService;
import com.chuange.aishijing.vo.servicevo.classesmanage.CouseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.transaction.Transactional;
import java.util.*;

/**
 * @author hpy
 * @create 2018/11/26
 */
@Service
@Transactional
public class CourserManagerServiceImpl implements CourserManagerService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    private ClassesDao classesDao;
    @Autowired
    private ClassesDetailsDao classesDetailsDao;
    @Autowired
    private ClassesSaleDao classesSaleDao;
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ClassesCommentsDao classesCommentsDao ;


    @Override
    public boolean  addClasses(AddClassesDTO addClassesDTO) throws Exception {
        boolean  result = false;
        try {
            long starttime = System.currentTimeMillis();
            Classes classes = new Classes();
            BeanUtils.copyProperties(addClassesDTO, classes);
            Classes resultClass = classesDao.saveAndFlush(classes);
            List<AddFirstClassesDTO> list = addClassesDTO.getFirstClasses();
            String classId = "";
            List<String> firstList = new ArrayList<String>();
            List<String> secondList = new ArrayList<String>();
            for (AddFirstClassesDTO addFirstClassesDTO : list) {
                ClassesDetails classesDetails = new ClassesDetails();
                classesDetails.setSectionGrade("1");
                classesDetails.setParentId("0");
                classesDetails.setSectionName(addFirstClassesDTO.getFirstSectionName());
                classesDetails.setClassId(resultClass.getId() + "");
                ClassesDetails resultClassesDetails = classesDetailsDao.saveAndFlush(classesDetails);
                List<AddSecondClassDTO> secondClassDTOS = addFirstClassesDTO.getSecondClasses();
                classId = resultClassesDetails.getId() + "";
                firstList.add(resultClassesDetails.getId() + "");
                for (AddSecondClassDTO addSecondClassDTO : secondClassDTOS) {
                    ClassesDetails secondClassDetails = new ClassesDetails();
                    secondClassDetails.setSectionGrade("2");
                    secondClassDetails.setParentId(resultClassesDetails.getId() + "");
                    secondClassDetails.setSectionName(addSecondClassDTO.getSecondSectionTitle());
                    secondClassDetails.setClassId(resultClass.getId() + "");
                    secondClassDetails.setCourseVideoUrl(addSecondClassDTO.getCourseVideoUrl());
                    secondClassDetails.setCourseVideoName(addSecondClassDTO.getCourseVideoName());
                    secondClassDetails.setCourseWareUrl(addSecondClassDTO.getCourseWareUrl());
                    secondClassDetails.setCourseWareName(addSecondClassDTO.getCourseWareName());
                    ClassesDetails resultSecondClassesDetails = classesDetailsDao.saveAndFlush(secondClassDetails);
                    secondList.add(resultSecondClassesDetails.getId() + "");
                }
            }
            logger.info("save result ClassesBasic id {} time ==> {}   firstClass idList {} secondClass idList {} ", new Object[]{
                    classId, (System.currentTimeMillis() - starttime) + "ms", firstList, secondList});
            result = true;
        }catch (Exception e) {
            logger.error(e.getMessage());
            throw  new Exception(e.getMessage());
        }finally {
            return result;
        }
    }

    @Override
    public AddClassesDTO getClasses(long classId) {
        long  starttime = System.currentTimeMillis();
        Optional<Classes> classesOptional =  classesDao.findByid(classId);
        Classes classes = classesOptional.get();
        AddClassesDTO addClassesDTO = new AddClassesDTO();
        BeanUtils.copyProperties(classes,addClassesDTO);
        String classid = classes.getId()+"";
        List<ClassesDetails>  classesDetailList = classesDetailsDao.findAllByClassId(classid);
        Map<String,AddFirstClassesDTO> firstClassesDTOMap = new HashMap<String,AddFirstClassesDTO>();
        for(ClassesDetails classesDetails1:classesDetailList){
            String sectiongrade = classesDetails1.getSectionGrade();
            if("1".equals(sectiongrade)){
                AddFirstClassesDTO addFirstClassesDTO = new AddFirstClassesDTO();
                // 大章节
                addFirstClassesDTO.setFirstSectionName(classesDetails1.getSectionName());
                addFirstClassesDTO.setFirstSectionId(classesDetails1.getId()+"");
                firstClassesDTOMap.put(classesDetails1.getId()+"",addFirstClassesDTO);
                addClassesDTO.addFirstClasses(addFirstClassesDTO);
            }

        }
        for(ClassesDetails classesDetails1:classesDetailList){
            String sectiongrade = classesDetails1.getSectionGrade();
            if("2".equals(sectiongrade)){
                String parentId = classesDetails1.getParentId();
                AddFirstClassesDTO addFirstClassesDTO = firstClassesDTOMap.get(parentId);
                AddSecondClassDTO secondClassDTO = new AddSecondClassDTO();
                // 大章节
                secondClassDTO.setSecondSectionTitle(classesDetails1.getSectionName());
                secondClassDTO.setCourseVideoName(classesDetails1.getCourseVideoName());
                secondClassDTO.setCourseVideoUrl(classesDetails1.getCourseVideoUrl());
                secondClassDTO.setCourseWareName(classesDetails1.getCourseWareName());
                secondClassDTO.setCourseWareUrl(classesDetails1.getCourseWareUrl());
                addFirstClassesDTO.addSecondClasses(secondClassDTO);
            }
        }
        logger.info(" result getClasses id {} time ==> {}   AddClassesDTO {} ",new Object[]{
                classId ,(System.currentTimeMillis()-starttime) +"ms",addClassesDTO});
        return addClassesDTO;
    }

    @Override
    public ClassesSale getClassesSale(long classId) {
        ClassesSale classesSale = classesSaleDao.findByClassesId(classId);
        return classesSale;
    }

    @Override
    public List<Order> getClassesOrder(long classId) {
        List<Order> classesOptional =  orderDao.findAllByClassId(classId);
        return classesOptional;
    }

    @Override
    public List<Order> getClassesOrderByOtherQuery(OrderQueryDTO orderQueryDTO) {
        List<Order> classesOptional = new ArrayList<Order>();
        long classId = orderQueryDTO.getClassId();
        String purchaser = orderQueryDTO.getPurchaser();
        if(!StringUtils.isEmpty(purchaser)){
            classesOptional =  orderDao.findAllByClassIdAndPurchaser(classId,purchaser);
        }else {
            classesOptional =  orderDao.findAllByClassId(classId);
        }
        return classesOptional;
    }

    @Override
    public List<AddClassesDTO> getClassesIdList() {
       List<AddClassesDTO> list = new ArrayList<AddClassesDTO>();
        long  starttime = System.currentTimeMillis();
        Sort sort = Sort.by(Sort.Order.desc("id") );
        List<Classes> classesOptional =  classesDao.findAll(sort);
        for(Classes classes:classesOptional){
            AddClassesDTO addClassesDTO = new AddClassesDTO();
            BeanUtils.copyProperties(classes,addClassesDTO);
            list.add(addClassesDTO);
        }
        logger.info(" result getClassesIdList time ==> {}   list {} ",new Object[]{
                (System.currentTimeMillis()-starttime) +"ms",list});
        return list;
    }

    @Override
    public List<ClassComments> getComments(long classid) {
        List<ClassComments> classComments = classesCommentsDao.findAllByClassId(classid);
        return classComments;
    }

    @Override
    public List<ClassComments> getCommentsByOtherQuery(CommentsQueryDTO commentsQueryDTO) {
        List<ClassComments> classesOptional = new ArrayList<ClassComments>();
        long classId = commentsQueryDTO.getClassId();
        String commentUser = commentsQueryDTO.getCommentUser();
        if(!StringUtils.isEmpty(commentUser)){
            classesOptional =  classesCommentsDao.findAllByClassIdAndCommentUser(classId,commentUser);
        }else {
            classesOptional =  classesCommentsDao.findAllByClassId(classId);
        }
        return classesOptional;
    }

    @Override
    public boolean delCommentByCommentId(long commentid) throws Exception {
        boolean result = false;
        try {
            classesCommentsDao.deleteById(commentid);
            result = true;
        }catch (Exception e){
            logger.error("delete error -> "+e.getMessage());
            throw new Exception();
        }finally {
            return result;
        }

    }


}

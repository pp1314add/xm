package com.chuange.aishijing.service.impl.courserManager;

import com.chuange.aishijing.dao.courserManager.ClassesDao;
import com.chuange.aishijing.dao.courserManager.ClassesDetailsDao;
import com.chuange.aishijing.dto.classes.AddClassesDTO;
import com.chuange.aishijing.dto.classes.AddFirstClassesDTO;
import com.chuange.aishijing.dto.classes.AddSecondClassDTO;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.classessys.ClassesDetails;
import com.chuange.aishijing.service.CourserManagerService;
import com.chuange.aishijing.vo.servicevo.classesmanage.CouseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

/**
 * @author augus
 * @create 2018/11/26 22:33
 */
@Service
@Transactional
public class CourserManagerServiceImpl implements CourserManagerService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    private ClassesDao classesDao;
    @Autowired
    private ClassesDetailsDao classesDetailsDao;


    @Override
    public CouseVO addClasses(AddClassesDTO addClassesDTO) {
        CouseVO couseVO = new CouseVO();
        long  starttime = System.currentTimeMillis();
        Classes classes = new Classes();
        BeanUtils.copyProperties(addClassesDTO,classes);
        Classes resultClass =  classesDao.saveAndFlush(classes);
        List<AddFirstClassesDTO>  list = addClassesDTO.getFirstClasses();
        String classId = "";
        List<String> firstList  =  new ArrayList<String>();
        List<String> secondList  =  new ArrayList<String>();
        for(AddFirstClassesDTO addFirstClassesDTO:list){
            ClassesDetails classesDetails = new ClassesDetails();
            classesDetails.setSectionGrade("1");
            classesDetails.setParentId("0");
            classesDetails.setSectionName(addFirstClassesDTO.getFirstSectionName());
            classesDetails.setClassId(resultClass.getId());
            ClassesDetails resultClassesDetails =  classesDetailsDao.saveAndFlush(classesDetails);
            List<AddSecondClassDTO>  secondClassDTOS =  addFirstClassesDTO.getSecondClasses();
            classId = resultClassesDetails.getId();
            firstList.add(resultClassesDetails.getId());
            for(AddSecondClassDTO addSecondClassDTO : secondClassDTOS){
                ClassesDetails secondClassDetails = new ClassesDetails();
                secondClassDetails.setSectionGrade("2");
                secondClassDetails.setParentId(resultClassesDetails.getId());
                secondClassDetails.setSectionName(addSecondClassDTO.getSecondSectionTitle());
                secondClassDetails.setClassId(resultClass.getId());
                secondClassDetails.setCourseVideoUrl(addSecondClassDTO.getCourseVideoUrl());
                secondClassDetails.setCourseVideoName(addSecondClassDTO.getCourseVideoName());
                secondClassDetails.setCourseWareUrl(addSecondClassDTO.getCourseWareUrl());
                secondClassDetails.setCourseWareName(addSecondClassDTO.getCourseWareName());
                ClassesDetails resultSecondClassesDetails = classesDetailsDao.saveAndFlush(classesDetails);
                secondList.add(resultSecondClassesDetails.getId());
            }
        }
        logger.info("save result ClassesBasic id {} time ==> {}   firstClass idList {} secondClass idList {} ",new Object[]{
                classId ,(System.currentTimeMillis()-starttime) +"ms",firstList,secondList});

        return couseVO;
    }

    @Override
    public CouseVO getClasses(String classId) {
        CouseVO couseVO = new CouseVO();
        long  starttime = System.currentTimeMillis();
        Optional<Classes> classesOptional =  classesDao.findByUserid(classId);
        Classes classes = classesOptional.get();
        AddClassesDTO addClassesDTO = new AddClassesDTO();
        BeanUtils.copyProperties(classes,addClassesDTO);

        String classid = classes.getId();
        List<ClassesDetails>  classesDetailList = classesDetailsDao.findAllByClassId(classid);
        Map<String,AddFirstClassesDTO> firstClassesDTOMap = new HashMap<String,AddFirstClassesDTO>();
        for(ClassesDetails classesDetails1:classesDetailList){
            String sectiongrade = classesDetails1.getSectionGrade();
            if("1".equals(sectiongrade)){
                AddFirstClassesDTO addFirstClassesDTO = new AddFirstClassesDTO();
                // 大章节
                addFirstClassesDTO.setFirstSectionName(classesDetails1.getSectionName());
            }
        }
        for(ClassesDetails classesDetails1:classesDetailList){
            String sectiongrade = classesDetails1.getSectionGrade();
            if("1".equals(sectiongrade)){
                AddFirstClassesDTO addFirstClassesDTO = new AddFirstClassesDTO();
                // 大章节
                addFirstClassesDTO.setFirstSectionName(classesDetails1.getSectionName());
            }
        }
        return null;
    }


}

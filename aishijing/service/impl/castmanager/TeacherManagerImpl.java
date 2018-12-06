package com.chuange.aishijing.service.impl.castmanager;


import com.chuange.aishijing.dao.castmanager.TeacherManagerDao;
import com.chuange.aishijing.pojo.teachersys.TeacherManager;
import com.chuange.aishijing.service.TeacherManagerService;
import com.mysql.jdbc.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

/**
 * Created by Administrator on 2018-11-21.
 */
@Service
@Transactional
public class TeacherManagerImpl implements TeacherManagerService{
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private final Integer size = 5;
    @Autowired
    private TeacherManagerDao teacherManagerDao;


    public Page<TeacherManager> selectTeacher(Integer page,String key) {
        Pageable pageable = PageRequest.of(page-1,size);
       Page<TeacherManager> t = teacherManagerDao.findAll(new Specification<TeacherManager>() {
            @Override
            public Predicate toPredicate(Root<TeacherManager> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                if(!StringUtils.isNullOrEmpty(key)){
                    System.out.println("有条件查询");
                    Predicate p1 = criteriaBuilder.like(root.get("teacherName").as(String.class), "%" + key + "%");
                    query.where(criteriaBuilder.and(p1));
                }
                return query.getRestriction();
            }
        }, pageable);
        return t;
    }

    @Override
    public int insertorupdateTeacher(TeacherManager teacherManager) {
        if(teacherManager.getId()!=null){
            teacherManagerDao.saveAndFlush(teacherManager);
        }
        try {
            teacherManagerDao.save(teacherManager);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
            return 1;
    }

    @Override
    public TeacherManager findTeacherById(String id) {
            TeacherManager teacherManager = teacherManagerDao.getOne(id);
            if(teacherManager==null){
                logger.info("根据id查询失败");
            }
        return teacherManager;
    }

    @Override
    public void deleteTeacherById(String id) {
        teacherManagerDao.deleteById(id);
    }
}

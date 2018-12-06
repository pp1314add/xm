package com.chuange.aishijing.service.impl.AuditSystem;

import com.chuange.aishijing.dao.auditsystem.AuditSystem;
import com.chuange.aishijing.dao.auditsystem.CastCertifiedDao;
import com.chuange.aishijing.dao.auditsystem.StarCertifiedDao;
import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.chuange.aishijing.pojo.checkSystem.Certification;
import com.chuange.aishijing.pojo.checkSystem.StarCertified;
import com.chuange.aishijing.service.AuditSystemService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.checksystemvo.CheckSystemResponseVO;
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
 * Created by Administrator on 2018-11-12.
 */
@Service
@Transactional
public class AuditSystemImpl implements AuditSystemService{
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private final Integer size = 5;
    @Autowired
    private AuditSystem auditSystem;
    @Autowired
    private StarCertifiedDao starCertifiedDao;
    @Autowired
    private CastCertifiedDao castCertifiedDao;
    @Override
    public Page<Certification> selectAll(Integer page, String key,String key1) {
        Page<Certification> c = null;
        //List<Certification> certifications = auditSystem.findAll();
        Pageable pageable = PageRequest.of(page - 1, size);
        if (key.equals("null")&&(key1.equals("")||key1=="")) {
            System.out.println("进入无条件");
             c = auditSystem.findAll(pageable);
        }else {
            System.out.println("进入有条件");
            Page<Certification> c1 = auditSystem.findAll(new Specification<Certification>() {
                @Override
                public Predicate toPredicate(Root<Certification> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                    Predicate p1 = criteriaBuilder.like(root.get("realname").as(String.class), "%" + key + "%");
                    if(!key1.equals("")) {
                        Predicate p2 = criteriaBuilder.equal(root.get("status").as(String.class), key1);
                        query.where(criteriaBuilder.and(p1,p2));
                    }else {
                        query.where(criteriaBuilder.and(p1));
                    }
                    return query.getRestriction();
                }
            }, pageable);
            for (Certification cc:c1){
                System.out.println(c1);
            }
            return c1;
        }
        return c;
    }
    //实名认证审批通过修改状态
    @Override
    public CheckSystemResponseVO updateStatus(String id,String flag) {
        CheckSystemResponseVO checkSystemResponseVO = new CheckSystemResponseVO();
        int s = auditSystem.modifyStatus(id,flag);
        if(s==1){
            String status = auditSystem.findStatus(id);
            checkSystemResponseVO.success("审批状态更新成功",new MD5(status).compute(),status);
        }else{
            logger.info("审批更新状态失败");
            checkSystemResponseVO.fail("审批状态更新失败");
        }

        return checkSystemResponseVO;
    }
    //星认证审批通过修改状态
    public CheckSystemResponseVO updateStarStatus(String id,String flag) {
        CheckSystemResponseVO checkSystemResponseVO = new CheckSystemResponseVO();
        int s = starCertifiedDao.modifyStatus(id,flag);
        if(s==1){
            String status = starCertifiedDao.findStatus(id);
            checkSystemResponseVO.success("星认证审批状态更新成功",new MD5(status).compute(),status);
        }else{
            logger.info("星认证审批更新状态失败");
            checkSystemResponseVO.fail("星认证审批状态更新失败");
        }

        return checkSystemResponseVO;
    }

    @Override
    public Page<CastCertified> selectCastAll(Integer page, String key,String key1) {
        Page<CastCertified> c = null;
        //List<Certification> certifications = auditSystem.findAll();
        Pageable pageable = PageRequest.of(page - 1, size);
        if (key.equals("null")&&(key1.equals("")||key1=="")) {
            c = castCertifiedDao.findAll(pageable);
        }else {
            Page<CastCertified> c1 = castCertifiedDao.findAll(new Specification<CastCertified>() {
                @Override
                public Predicate toPredicate(Root<CastCertified> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                    Predicate p1 = criteriaBuilder.like(root.get("username").as(String.class), "%" + key + "%");
                    if(!key1.equals("")) {
                        Predicate p2 = criteriaBuilder.equal(root.get("handleStatus").as(String.class), key1);
                        query.where(criteriaBuilder.and(p1,p2));
                    }else {
                        query.where(criteriaBuilder.and(p1));
                    }
                    return query.getRestriction();
                }
            }, pageable);
            return c1;
        }
        return c;
    }

    @Override
    public CheckSystemResponseVO updateCastStatus(String id, String flag) {
        CheckSystemResponseVO checkSystemResponseVO = new CheckSystemResponseVO();
        int s = castCertifiedDao.modifyStatus(id,flag);
        if(s==1){
            String status = castCertifiedDao.findStatus(id);
            checkSystemResponseVO.success("剧组认证审批状态更新成功",new MD5(status).compute(),status);
        }else{
            logger.info("剧组认证审批更新状态失败");
            checkSystemResponseVO.fail("剧组认证审批状态更新失败");
        }

        return checkSystemResponseVO;
    }


    public Page<StarCertified> selectStarAll(Integer page, String key,String key1) {
        Page<StarCertified> c = null;
        //List<Certification> certifications = auditSystem.findAll();
        Pageable pageable = PageRequest.of(page - 1, size);
        if (key.equals("null")&&(key1.equals("")||key1=="")) {
            c = starCertifiedDao.findAll(pageable);
        }else {
            Page<StarCertified> c1 = starCertifiedDao.findAll(new Specification<StarCertified>() {
                @Override
                public Predicate toPredicate(Root<StarCertified> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                    Predicate p1 = criteriaBuilder.like(root.get("username").as(String.class), "%" + key + "%");
                    if(!key1.equals("")) {
                        Predicate p2 = criteriaBuilder.equal(root.get("handleStatus").as(String.class), key1);
                        query.where(criteriaBuilder.and(p1,p2));
                    }else {
                        query.where(criteriaBuilder.and(p1));
                    }
                    return query.getRestriction();
                }
            }, pageable);
            return c1;
        }
        return c;
    }
}

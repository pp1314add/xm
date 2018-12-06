package com.chuange.aishijing.service.impl.castmanager;

import com.chuange.aishijing.dao.auditsystem.CastCertifiedDao;
import com.chuange.aishijing.dao.castmanager.CastManagerDao;
import com.chuange.aishijing.dao.castmanager.CastMemberDao;
import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.castmanage.CastMember;
import com.chuange.aishijing.service.CastManagerService;
import com.chuange.aishijing.vo.servicevo.CastManagervo.AddCastManagerResponse;
import com.mysql.jdbc.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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
 * Created by Administrator on 2018-11-15.
 */
@Service
@Transactional
public class CastManagerImpl implements CastManagerService{
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    private CastManagerDao castManagerDao;
    @Autowired
    private CastMemberDao castMemberDao;
    private final Integer size = 5;

    public Page<Cast> seletCast(Integer page,String key) {
        Page<Cast> c = null;
        //List<Certification> certifications = auditSystem.findAll();
        Pageable pageable = PageRequest.of(page - 1, size);
        if (key.equals("null")) {
            c = castManagerDao.findAll(pageable);
        }else {
            Page<Cast> c1 = castManagerDao.findAll(new Specification<Cast>() {
                @Override
                public Predicate toPredicate(Root<Cast> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                    Predicate p1 = criteriaBuilder.like(root.get("castname").as(String.class), "%" + key + "%");
                        query.where(criteriaBuilder.and(p1));
                    return query.getRestriction();
                }
            }, pageable);
            return c1;
        }
        return c;
    }

    @Override
    public Page<CastMember> seletCastMember(Integer page, String key,String castId) {
        Page<CastMember> c = null;
        //List<Certification> certifications = auditSystem.findAll();
        Pageable pageable = PageRequest.of(page - 1, size);

            Page<CastMember> c1 = castMemberDao.findAll(new Specification<CastMember>() {
                @Override
                public Predicate toPredicate(Root<CastMember> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                    if(StringUtils.isNullOrEmpty(key)){
                        System.out.println("进入无条件where");
                        Predicate p1 = criteriaBuilder.equal(root.get("castid").as(String.class),castId);
                        query.where(criteriaBuilder.and(p1));
                    }else{
                        Predicate p1 = criteriaBuilder.like(root.get("memberName").as(String.class), "%" + key + "%");
                        query.where(criteriaBuilder.and(p1));
                    }
                    return query.getRestriction();
                }
            }, pageable);
            return c1;
    }

    @Override
    public int insertorupdateCast(AddCastManagerResponse addCastManagerResponse) {

        Cast cast = new Cast();

        cast.setShootingPlace(addCastManagerResponse.getShootingplace());
        cast.setCastname(addCastManagerResponse.getCastname());
        cast.setCastType(addCastManagerResponse.getCasttype());
        cast.setCastLogo(addCastManagerResponse.getLogo());
        cast.setBuildTime(addCastManagerResponse.getBuildtime());
        cast.setContacts(addCastManagerResponse.getContacts());
        cast.setContactsEmail(addCastManagerResponse.getContactsemail());
        System.out.println("联系人邮箱："+addCastManagerResponse.getContactsemail());
        cast.setCompanyName(addCastManagerResponse.getCompanyname());
        cast.setContactsTel(addCastManagerResponse.getContactstel());
        cast.setDirector(addCastManagerResponse.getDirector());
        cast.setLicenseImg(addCastManagerResponse.getLicenseImg());
        cast.setLicenseNum(addCastManagerResponse.getLicenseNum());
        cast.setStartTime(addCastManagerResponse.getStarttime());
        cast.setComcontacts(addCastManagerResponse.getComcontacts());
        cast.setComcontactsTel(addCastManagerResponse.getComcontactstel());
        cast.setComcontactsEmail(addCastManagerResponse.getComcontactemail());
        try{
            if(addCastManagerResponse.getEditId()!=null){
                cast.setId(addCastManagerResponse.getEditId());
                castManagerDao.saveAndFlush(cast);
            }else {
                castManagerDao.save(cast);
            }
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public int insertorupdateCastMember(CastMember castMember) {
        if (castMember.getId()==null){
            try {
                castMemberDao.save(castMember);
            }catch (Exception e){
                e.printStackTrace();
                return  0;
            }
        }else{
            try{
                castMemberDao.saveAndFlush(castMember);
            }catch (Exception e){
                e.printStackTrace();
                return 0;
            }
        }
        return 1;
    }

    @Override
    public int deleteCast(String delId) {
        try {
            castManagerDao.deleteById(delId);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public int deleteCastMember(String delId) {
        try {
            castMemberDao.deleteById(delId);
        }catch (Exception e){
            e.printStackTrace();
            logger.info("删除失败");
            return 0;

        }
        return 1;
    }

    @Override
    public Cast findCastById(String editId) {
        Cast cast = castManagerDao.getOne(editId);

        if(cast==null){
         logger.info("查询数据失败");
        }
        return cast;
    }

    @Override
    public int updateCast(AddCastManagerResponse addCastManagerResponse) {
        Cast cast = new Cast();
        try{
            BeanUtils.copyProperties(addCastManagerResponse,cast);
        }catch (Exception e){
            e.printStackTrace();
            logger.info("赋值失败");
        }

        castManagerDao.save(cast);
        System.out.println(cast);
        return 0;
    }
}

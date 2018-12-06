package com.chuange.aishijing.service;


import com.chuange.aishijing.dao.PersonRepository;
import com.chuange.aishijing.vo.servicevo.PersonServiceVo;

/**
 * Created by Administrator on 2018-10-16.
 */
public interface PersonService {
    PersonServiceVo findAll();
    PersonServiceVo savePerson();
    PersonServiceVo deletePerson();
    PersonServiceVo findById();
    PersonServiceVo deletePersonEmail();
}

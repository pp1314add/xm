package com.chuange.aishijing.service.impl;


import com.chuange.aishijing.dao.PersonRepository;
import com.chuange.aishijing.pojo.Person;
import com.chuange.aishijing.service.PersonService;
import com.chuange.aishijing.util.BusinessException;
import com.chuange.aishijing.util.CommonConstant;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.PersonServiceVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-10-16.
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Autowired
    private PersonRepository personRepository;
    //查询所有数据
    public PersonServiceVo findAll(){
        PersonServiceVo personServiceVo = new PersonServiceVo();
        logger.debug("debug....liye");
        List<Person> list = new ArrayList<Person>();
        String md5 = new MD5(personServiceVo.toString()).compute();
        personServiceVo.success("查询成功",md5,personRepository.findAll());

        return personServiceVo;
    }
    //保存数据
    public PersonServiceVo savePerson(){
        PersonServiceVo personServiceVo = new PersonServiceVo();
        Person person = new Person();
        person.setName("丽丽");
        person.setAge(24);
        personRepository.save(person);
        personServiceVo.success("保存数据成功");
        return personServiceVo;
    }
    //删除数据
    public PersonServiceVo deletePerson(){
        PersonServiceVo personServiceVo = new PersonServiceVo();
        try {
            personRepository.deleteById("李野");
          System.out.print("删除数据标记");
        }catch (Exception e){
            e.printStackTrace();
            throw new BusinessException(CommonConstant.SYSTEM_EXCEPTION, "系统异常：更新应用信息异常");
        }

           personServiceVo.success("删除数据成功");
        return personServiceVo;
    }

    //自定义SQL，根据条件查询
    public PersonServiceVo findById() {
        PersonServiceVo personServiceVo = new PersonServiceVo();
        String emails =  personRepository.findByEmaill("1140046646@qq.com");
        String md5 = new MD5(personServiceVo.toString()).compute();
        personServiceVo.success("根据条件查询成功",md5,emails);
        return personServiceVo;
    }

    @Override
    public PersonServiceVo deletePersonEmail() {
        PersonServiceVo personServiceVo = new PersonServiceVo();
        int s = personRepository.deleteByEmail("11111");
        if(s==1){
            personServiceVo.success("删除数据成功");
        }else{
            personServiceVo.fail("删除数据失败");
        }

        return personServiceVo;
    }


}

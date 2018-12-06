package com.chuange.aishijing.controller;


import com.chuange.aishijing.service.PersonService;
import com.chuange.aishijing.vo.servicevo.PersonServiceVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2018-10-16.
 */
@RestController
@ComponentScan(basePackages={"com"})

public class Aishijingtest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    private PersonService personService;

    @RequestMapping(value="/testSelectById", method= RequestMethod.GET)
    @ResponseBody
    public PersonServiceVo findbyid(){

        return personService.findById();
    }
    @RequestMapping(value="/testSelect", method= RequestMethod.GET)
    @ResponseBody
    public PersonServiceVo select(){

        return personService.findAll();
    }
    @RequestMapping(value="/testInsert", method= RequestMethod.GET)
    @ResponseBody
    public String insert(){
        personService.savePerson();
        return "INSERTSUCCESS";
    }
    @RequestMapping(value="/testDelete", method= RequestMethod.GET)
    @ResponseBody
    public PersonServiceVo delete(){
        PersonServiceVo personServiceVo = personService.deletePerson();
        if(personServiceVo.getMsg().equals("SUCCESS")){
            return personServiceVo;
        }
        return personServiceVo;
    }
    @RequestMapping(value="/testDeleteByEmail", method= RequestMethod.GET)
    @ResponseBody
    public PersonServiceVo deletebyemail(){
        PersonServiceVo personServiceVo = personService.deletePersonEmail();

        return personServiceVo;
    }

}

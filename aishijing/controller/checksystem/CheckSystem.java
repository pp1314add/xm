package com.chuange.aishijing.controller.checksystem;

import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.chuange.aishijing.pojo.checkSystem.Certification;
import com.chuange.aishijing.pojo.checkSystem.StarCertified;
import com.chuange.aishijing.service.AuditSystemService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.checksystemvo.CheckSystemResponse;
import com.chuange.aishijing.vo.servicevo.checksystemvo.CheckSystemResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-11-13.
 */
@RestController
@SpringBootApplication
public class CheckSystem {

    @Autowired
    private AuditSystemService auditSystemService;

    @ResponseBody
    @RequestMapping("/check")
    public CheckSystemResponseVO check(@RequestParam Integer page,@RequestParam String key,@RequestParam String key1){
        System.out.println("key;"+key);
        System.out.println("key1;"+key1);
        CheckSystemResponse checkSystemResponse = new CheckSystemResponse();
        CheckSystemResponseVO checkSystemResponseVO = new CheckSystemResponseVO();
        System.out.println("进入contro");
        List<Certification> list = new ArrayList<Certification>();
        Page<Certification> certifications = auditSystemService.selectAll(page,key,key1);
        int totalPages = certifications.getTotalPages();
        Long totalElements = certifications.getTotalElements();
        System.out.println("总条数:"+certifications.getTotalElements());
        for (Certification ss : certifications){
            System.out.println(ss);
            list.add(ss);
        }
        checkSystemResponse.setList(list);
        checkSystemResponse.setTotalElements(totalElements);
        checkSystemResponse.setTotalPage(totalPages);
        String md5 = new MD5(checkSystemResponseVO.toString()).compute();
        checkSystemResponseVO.success("成功",md5,checkSystemResponse);
        return checkSystemResponseVO;
    }

    @ResponseBody
    @RequestMapping("/checkPass")
    public CheckSystemResponseVO checkpass(@RequestParam String id,@RequestParam String flag){
        CheckSystemResponseVO checkSystemResponseVO = auditSystemService.updateStatus(id,flag);
        return checkSystemResponseVO;
    }

    @ResponseBody
    @RequestMapping("/starcheck")
    public CheckSystemResponseVO startcheck(@RequestParam Integer page,@RequestParam String key,@RequestParam String key1){
        CheckSystemResponse checkSystemResponse = new CheckSystemResponse();
        CheckSystemResponseVO checkSystemResponseVO = new CheckSystemResponseVO();
        List<StarCertified> list = new ArrayList<StarCertified>();
        Page<StarCertified> starCertifieds = auditSystemService.selectStarAll(page,key,key1);
        int totalPages = starCertifieds.getTotalPages();
        Long totalElements = starCertifieds.getTotalElements();
        System.out.println("总条数:"+starCertifieds.getTotalElements());
        for (StarCertified ss : starCertifieds){
            System.out.println(ss);
            list.add(ss);
        }
        checkSystemResponse.setStarList(list);
        checkSystemResponse.setTotalElements(totalElements);
        checkSystemResponse.setTotalPage(totalPages);
        String md5 = new MD5(checkSystemResponseVO.toString()).compute();
        checkSystemResponseVO.success("成功",md5,checkSystemResponse);

        return checkSystemResponseVO;
    }
    @ResponseBody
    @RequestMapping("/startcheckPass")
    public CheckSystemResponseVO startcheckPass(@RequestParam String id,@RequestParam String flag){
        CheckSystemResponseVO checkSystemResponseVO = auditSystemService.updateStarStatus(id,flag);
        return checkSystemResponseVO;
    }

    @ResponseBody
    @RequestMapping("/castcheck")
    public CheckSystemResponseVO castcheck(@RequestParam Integer page,@RequestParam String key,@RequestParam String key1){
        CheckSystemResponse checkSystemResponse = new CheckSystemResponse();
        CheckSystemResponseVO checkSystemResponseVO = new CheckSystemResponseVO();
        List<CastCertified> list = new ArrayList<CastCertified>();
        Page<CastCertified> castCertifieds = auditSystemService.selectCastAll(page,key,key1);
        int totalPages = castCertifieds.getTotalPages();
        Long totalElements = castCertifieds.getTotalElements();
        System.out.println("总条数:"+castCertifieds.getTotalElements());
        for (CastCertified ss : castCertifieds){
            System.out.println(ss);
            list.add(ss);
        }
        checkSystemResponse.setCastCertifiedList(list);
        checkSystemResponse.setTotalElements(totalElements);
        checkSystemResponse.setTotalPage(totalPages);
        String md5 = new MD5(checkSystemResponseVO.toString()).compute();
        checkSystemResponseVO.success("成功",md5,checkSystemResponse);

        return checkSystemResponseVO;
    }
    @ResponseBody
    @RequestMapping("/castcheckPass")
    public CheckSystemResponseVO castcheckPass(@RequestParam String id,@RequestParam String flag){
        CheckSystemResponseVO checkSystemResponseVO = auditSystemService.updateCastStatus(id,flag);
        return checkSystemResponseVO;
    }
}

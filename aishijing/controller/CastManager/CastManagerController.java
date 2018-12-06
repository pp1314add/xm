package com.chuange.aishijing.controller.CastManager;

import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.castmanage.CastMember;
import com.chuange.aishijing.service.CastManagerService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.CastManagervo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2018-11-15.
 */
@RestController
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class CastManagerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    private CastManagerService castManagerService;
    @ResponseBody
    @RequestMapping("/cast")
    public CastManagerResponseVo cast(@RequestParam Integer page,@RequestParam String key){
        CastManagerResponseVo castManagerResponseVo = new CastManagerResponseVo();
        CastManagerResponse castManagerResponse = new CastManagerResponse();
        Page<Cast> casts = castManagerService.seletCast(page,key);
        List<Cast> list = new ArrayList<Cast>();
        for (Cast cc:casts){
            list.add(cc);
        }
        castManagerResponse.setCastList(list);
        castManagerResponse.setTotalPage(casts.getTotalPages());
        castManagerResponse.setTotalElements(casts.getTotalElements());
        castManagerResponseVo.success("返回成功",new MD5(casts.toString()).compute(),castManagerResponse);
        return castManagerResponseVo;
    }
    @ResponseBody
    @RequestMapping("/castmember")
    public CastManagerResponseVo castmember(@RequestParam Integer page,@RequestParam(required = false) String key,@RequestParam String castId){
        System.out.println("当前页;"+page+",查询条件："+key);
        CastManagerResponseVo castManagerResponseVo = new CastManagerResponseVo();
        CastMemberResponse castManagerResponse = new CastMemberResponse();
        Page<CastMember> castMembers = castManagerService.seletCastMember(page,key,castId);
        List<CastMember> list = new ArrayList<CastMember>();
        for (CastMember cc:castMembers){
            System.out.println(cc);
            list.add(cc);
        }
        castManagerResponse.setCastMemberList(list);
        castManagerResponse.setTotalPage(castMembers.getTotalPages());
        castManagerResponse.setTotalElements(castMembers.getTotalElements());
        castManagerResponseVo.success("返回成功",new MD5(castMembers.toString()).compute(),castManagerResponse);
        return castManagerResponseVo;
    }

    @ResponseBody
    @RequestMapping("/insertcast")
    public String addcast(@RequestBody AddCastManagerResponse addCastManagerResponse){
        String msg = "";
        int s= castManagerService.insertorupdateCast(addCastManagerResponse);
        if(s==1){
            msg = "插入数据成功";
        }else{
            msg = "插入数据失败";
        }
        return msg;
    }
    @ResponseBody
    @RequestMapping("/insertcastmember")
    public String insertcastmember(@RequestBody CastMember castMember){
        String msg = "";
        int s= castManagerService.insertorupdateCastMember(castMember);
        if(s==1){
            msg = "success";
        }else{
            msg = "fail";
        }
        return msg;
    }


    @ResponseBody
    @RequestMapping("/deletecast")
    public String deletecast(@RequestParam String delId ){
        String msg = "";
        int s= castManagerService.deleteCast(delId);
        if(s==1){
            msg = "删除数据成功";
        }else{
            msg = "删除数据失败";
        }
        return msg;
    }
    @ResponseBody
    @RequestMapping("/deletecastmember")
    public String deletecastmember(@RequestParam String delId ){
        String msg = "";
        int s= castManagerService.deleteCastMember(delId);
        if(s==1){
            msg = "success";
        }else{
            msg = "fail";
        }
        return msg;
    }
    @ResponseBody
    @RequestMapping("/findcastbyid")
    public FindCastByIdResponseVO findcast(@RequestParam String id ){
        FindCastByIdResponseVO findCastByIdResponseVO = new FindCastByIdResponseVO();
        Cast cast= castManagerService.findCastById(id);
        findCastByIdResponseVO.success("查询数据成功",new MD5(findCastByIdResponseVO.toString()).compute(),cast);
        return findCastByIdResponseVO;
    }
    @ResponseBody
    @RequestMapping("/updatecast")
    public FindCastByIdResponseVO updatecast(@RequestParam AddCastManagerResponse addCastManagerResponse ){
        FindCastByIdResponseVO findCastByIdResponseVO = new FindCastByIdResponseVO();
        castManagerService.updateCast(addCastManagerResponse);
        findCastByIdResponseVO.success("更新数据成功");
        return findCastByIdResponseVO;
    }
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam(value="logo",required=false) MultipartFile file, HttpServletRequest request){
        System.out.println("file的值："+file);
        if (file.isEmpty()) {
            return new String("文件为空");
        }
        // 获取文件名
        String fileName = file.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为：" + suffixName);
        if(".jpg".equals(suffixName.trim())||".png".equals(suffixName.trim())){

            // 文件上传后的路径
            String filePath = "D://IDEA//course01//src//main//resources//static//download//img//";//服务器路径
// 解决中文问题，liunx下中文路径，图片显示问题
// fileName = UUID.randomUUID() + suffixName;
            fileName=  UUID.randomUUID().toString().replace("-", "")+".png";
            File dest = new File(filePath +fileName);
// 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();

            }
            try {
                //保存图片名称和路径

            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new String("上传的不是图片！");
    }

}

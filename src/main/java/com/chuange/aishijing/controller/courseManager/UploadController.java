package com.chuange.aishijing.controller.courseManager;

import com.chuange.aishijing.dto.UploadDTO;
import com.chuange.aishijing.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

/**
 * @author hpy
 * @create 2018/11/27
 */
@RestController()
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    private static String OK = "200";
    private static String ERROR = "500";

    @RequestMapping(value = "/add/{uploadType}/{uploadName}/{uploadSuffixName}" ,method = RequestMethod.POST)
    public void addUpload(HttpServletRequest request, @PathVariable  String  uploadType , @PathVariable String uploadName
            , @PathVariable String uploadSuffixName) throws IOException {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        String classPath = this.getClass().getClassLoader().getResource("").getPath();
        byte[] buffer=new byte[1024*4];
        InputStream in = request.getInputStream();
        int n=0;
        while ( (n=in.read(buffer)) !=-1) {
            out.write(buffer,0,n);
        }
        byte[] content = out.toByteArray();
        UploadDTO uploadDTO = new UploadDTO();
        uploadDTO.setUploadName(uploadName);
        uploadDTO.setUploadType(uploadType);
        String fileName=  UUID.randomUUID().toString().replace("-", "")+"."+uploadSuffixName;
        File dest = new File(classPath +File.separator+uploadSuffixName+File.separator+fileName);
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            fos = new FileOutputStream(dest);
            bos = new BufferedOutputStream(fos);
            bos.write(content);
        }catch (Exception e){

        }

        long resultId = uploadService.addUpload(uploadDTO);


    }


}

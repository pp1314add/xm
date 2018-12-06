package com.chuange.aishijing.service.impl.upload;

import com.chuange.aishijing.dao.upload.UploadDao;
import com.chuange.aishijing.dto.UploadDTO;
import com.chuange.aishijing.pojo.upload.UploadByte;
import com.chuange.aishijing.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hpy
 * @create 2018/11/27
 */
@Service
public class UploadServiceIml implements UploadService {
    @Autowired
    private UploadDao uploadDao;
    @Override
    public Long addUpload(UploadDTO uploadDTO) {
        long  result = 0;
        UploadByte uploadByte = new UploadByte();
       // uploadByte.setUploadByte(uploadDTO.getContent());
        uploadByte.setUploadName(uploadDTO.getUploadName());
        uploadByte.setUploadType(uploadDTO.getUploadType());
        UploadByte  resultUpload = uploadDao.saveAndFlush(uploadByte);
        if(resultUpload!=null){
            result = resultUpload.getId();
        }
        return result;
    }
}

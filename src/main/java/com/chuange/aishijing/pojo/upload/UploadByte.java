package com.chuange.aishijing.pojo.upload;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Date;

/**
 * @author hpy
 * @create 2018/11/27
 */
@Entity
@Table(name="ASJ_UPLOADBYTE")
public class UploadByte {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String uploadType;
    private String uploadName;
    private byte[] uploadByte;


    @Override
    public String toString() {
        return "UploadByte{" +
                "id=" + id +
                ", uploadType='" + uploadType + '\'' +
                ", uploadName='" + uploadName + '\'' +
                ", uploadByte=" + Arrays.toString(uploadByte) +
                '}';
    }

    public UploadByte() {
    }

    public UploadByte(String uploadType, String uploadName, byte[] uploadByte) {
        this.uploadType = uploadType;
        this.uploadName = uploadName;
        this.uploadByte = uploadByte;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    public String getUploadName() {
        return uploadName;
    }

    public void setUploadName(String uploadName) {
        this.uploadName = uploadName;
    }

    public byte[] getUploadByte() {
        return uploadByte;
    }

    public void setUploadByte(byte[] uploadByte) {
        this.uploadByte = uploadByte;
    }
}

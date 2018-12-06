package com.chuange.aishijing.vo;


import com.chuange.aishijing.util.CommonConstant;

/**
 * Created by erakis on 16/9/13.
 * 错误代码对象
 */
public class CommonResponseVO {
    //错误代码
    private String code;
    //错误消息
    private String msg;
    //接口数据MD5摘要
    private String hash;
    //接口数据
    private Object data;
    public CommonResponseVO(){};

    public CommonResponseVO(final String code, final  String msg, final String hash, final Object data) {
        this.code = code;
        this.msg = msg;
        this.hash = hash;
        this.data = data;
    }
    public CommonResponseVO(final String code, final  String msg) {
        this.code = code;
        this.msg = msg;
        this.hash = null;
        this.data = null;
    }
    public void fail(String msg){
        this.code = CommonConstant.SUCCESS_F;
        this.msg = msg;
    }
    public void success(String msg){          //无data赋值时调用
        this.code = CommonConstant.SUCCESS_S;
        this.msg = msg;
    }
    public void success(String msg,String hash,Object data){    //有data赋值时调用
        this.code = CommonConstant.SUCCESS_S;
        this.msg = msg;
        this.hash = hash;
        this.data = data;
    }
    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

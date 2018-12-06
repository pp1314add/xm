package com.chuange.alipay.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chuange.alipay.service.AlipayService;
@RestController
public class NotifyController {
	@Autowired
	private AlipayService alipayService;
	@RequestMapping(value="/notify_url",method=RequestMethod.POST)
	@ResponseBody
	public String notify(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		//支付后，支付宝会回调，从支付宝回调的request取值
		//获取支付宝返回的参数集合
		Map<String,String[]> aliParams=request.getParameterMap();
		//存放转化之后的参数集合
		Map<String,String> conversionParams=new HashMap<String,String>();
		for (Iterator<String> iterator = aliParams.keySet().iterator(); iterator.hasNext();) {
			String key=iterator.next();
			String[] values=aliParams.get(key);
			String valueStr="";
			for (int i = 0; i < values.length; i++) {
				valueStr=(i==values.length-1) ? valueStr+values[i] : valueStr+values [i]+",";
			}
			conversionParams.put(key, valueStr);
		}
		String status=alipayService.notify(conversionParams);
		return status;
	}
}
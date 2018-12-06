package com.chuange.alipay.service;

import java.util.Map;


import com.chuange.alipay.bean.AlipayOrderBean;
import com.chuange.alipay.bean.OrderBean;

public interface AlipayService {
	//生成订单信息
	public void createOrderInfo(AlipayOrderBean alipayOrder);
	//对订单信息加签并返回
	public String getAlipayOrderStr(OrderBean order);
	//异步返回订单情况
	//public String notify(HttpServletRequest request,HttpServletResponse response)throws IOException;
	//异步请求逻辑处理
	public String notify(Map<String,String> conversionParams);
	//支付完成，返回app，app调用最终付款校验
	public Byte checkAlipay(String OutTradeNo);
	//根据传给支付宝的订单号查询订单信息
	public AlipayOrderBean selectByOutTradeNo(String outTradeNo);
	//更新交易表
	public int updateByPrimarykey(AlipayOrderBean alipayOrder);
	
}

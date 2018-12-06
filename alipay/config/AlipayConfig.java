package com.chuange.alipay.config;

public class AlipayConfig {
	//pid 沙箱：2016092100562795
	public static String partner="2088112211295396";
	//收款支付宝账号，同上
	public static String seller_id="2088112211295396";
	//商户appid
	public static String APPID="2018102361788558";
	//私钥 pkcs8
	public static String RSA_PRIVATE_KEY="";
	//支付宝公钥
	public static String ALIPAY_PUBLIC_KEY="";
	//服务器异步通知页面路径
	public static String notify_url="";
	//页面跳转同步通知页面路径
	public static String return_url="";
	//请求支付宝的网关地址
	public static String URL="https://openapi.alipay.com/gateway.do";
	//编码
	public static String CHARSET="UTF-8";
	//返回格式
	public static String FORMAT="json";
	//加密类型
	public static String SIGNTYPE="RSA2";
	
}

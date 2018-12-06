package com.chuange.alipay.service.Impl;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.chuange.alipay.bean.AlipayOrderBean;
import com.chuange.alipay.bean.OrderBean;
import com.chuange.alipay.config.AlipayConfig;
import com.chuange.alipay.dao.AlipayReporsitory;
import com.chuange.alipay.service.AlipayService;
@Service
@Transactional
public class AlipayServiceImpl implements AlipayService{

	public String APP_ID=AlipayConfig.APPID;
	public String APP_Private_key=AlipayConfig.RSA_PRIVATE_KEY;
	public String charset=AlipayConfig.CHARSET;
	public String format=AlipayConfig.FORMAT;
	public String url=AlipayConfig.URL;
	public String alipay_public_key=AlipayConfig.ALIPAY_PUBLIC_KEY;
	public String signtype=AlipayConfig.SIGNTYPE;
	public String orderStr="";
	@Autowired
	private AlipayReporsitory alipayReporsitory;
	DateFormat dateFormat=new DateFormat() {
		
		@Override
		public Date parse(String source, ParsePosition pos) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	@Override
	public String getAlipayOrderStr(OrderBean order) {
		// TODO Auto-generated method stub
		order.setOrderId("1");
		AlipayOrderBean alipayOrder=new AlipayOrderBean();
		alipayOrder.setBuyerPayAmount(0.01);
		alipayOrder.setClubOrderId(order.getOrderId());
		alipayOrder.setInvoiceAmount(order.getInvoiceAmount());
		alipayOrder.setOutTradeNo(order.getOutTradeNo());
		alipayOrder.setReceiptAmount(order.getReceiptAmount());
		alipayOrder.setRefundFee(order.getRefundFee());
		alipayOrder.setTotalAmount(order.getTotalAmount());
		alipayOrder.setTradeStatus(order.getTradeStatus());
		try {
			//实例化客户端（网关，appid，app私钥，格式（utf8），编码，支付宝公钥，加密类型）取得预付订单信息
			AlipayClient alipayClient=new DefaultAlipayClient(url, APP_ID, APP_Private_key, 
					format, charset, alipay_public_key, signtype);
			//实例化具体api中对应接口
			AlipayTradeAppPayRequest ali_request=new AlipayTradeAppPayRequest();
			//实例化sdk model
			AlipayTradeAppPayModel model=new AlipayTradeAppPayModel();
			//传入业务参数
			model.setBody(order.getBody());//商品描述信息
			model.setSubject(order.getSubject());
			model.setOutTradeNo(order.getOutTradeNo());
			model.setTimeoutExpress("30ms");
			model.setTotalAmount(order.getTotalAmount().toString());
			model.setProductCode("QUICK_MSECURITY_PAY");//销售产品码
			ali_request.setBizModel(model);
			ali_request.setNotifyUrl("");//服务器地址
			ali_request.setReturnUrl(AlipayConfig.return_url);//同步回调地址 app
			
			//调用sdk接口
			AlipayTradeAppPayResponse alipayTradeAppPayResponse=alipayClient.sdkExecute(ali_request);
			orderStr=alipayTradeAppPayResponse.getBody();
			this.createOrderInfo(alipayOrder);
		}catch (AlipayApiException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return orderStr;
	}
	
/**
 * 想支付宝发起订单查询请求
 */
	@Override
	public Byte checkAlipay(String OutTradeNo) {
		try {
			//实例化客户端（网关，appid，app私钥，格式（utf8），编码，支付宝公钥，加密类型）取得预付订单信息
			AlipayClient alipayClient=new DefaultAlipayClient(url, APP_ID, APP_Private_key, 
					format, charset, alipay_public_key, signtype);
			//实例化具体api中对应接口
			AlipayTradeQueryRequest alipayTradeQueryRequest=new AlipayTradeQueryRequest();
			alipayTradeQueryRequest.setBizContent("{"+
			"\"out_trade_no\":\""+OutTradeNo+"\""+
					"}");
			AlipayTradeQueryResponse alipayTradeQueryResponse=alipayClient.execute(alipayTradeQueryRequest);
			if(alipayTradeQueryResponse.isSuccess()) {
				AlipayOrderBean order=this.selectByOutTradeNo(OutTradeNo);
				//修改数据库支付订单表
				order.setTradeNo(alipayTradeQueryResponse.getTradeNo());
				order.setBuyerLogonId(alipayTradeQueryResponse.getBuyerLogonId());
				order.setTotalAmount(Double.valueOf(alipayTradeQueryResponse.getTotalAmount()));
				order.setReceiptAmount(Double.valueOf(alipayTradeQueryResponse.getReceiptAmount()));
				order.setInvoiceAmount(Double.valueOf(alipayTradeQueryResponse.getInvoiceAmount()));
				order.setBuyerPayAmount(Double.valueOf(alipayTradeQueryResponse.getBuyerPayAmount()));
				switch(alipayTradeQueryResponse.getTradeStatus()) {
				case "TRADE_FINISHED":
					order.setTradeStatus((byte) 3);
					break;
				case "TRADE_SUCCESS":
					order.setTradeStatus((byte) 2);
					break;
				case "TRADE_CLOSED":
					order.setTradeStatus((byte) 1);
					break;
				case "WAIT_BUYER__PAY":
					order.setTradeStatus((byte) 0);
					break;
				default:
					break;
				}
				this.updateByPrimarykey(order);
				return order.getTradeStatus();
			}else {
				//调用接口失败
			}
		} catch (AlipayApiException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void createOrderInfo(AlipayOrderBean alipayOrder) {
		// TODO Auto-generated method stub
		alipayReporsitory.save(alipayOrder);
	}
	/**
	 * 异步逻辑处理
	 */
	@Override
	public String notify(Map<String, String> conversionParams) {
		// TODO Auto-generated method stub
		boolean signVerified=false;
		try {
			//验证签名
			signVerified=AlipaySignature.rsaCheckV1(conversionParams, alipay_public_key, charset, signtype);
		} catch (AlipayApiException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//验签通过
		if (signVerified) {
			String appId=conversionParams.get("app_id");
			String notifyTime=conversionParams.get("notify_time");//通知时间
			String gmtCreate=conversionParams.get("gmt_create");//交易创建时间
			String gmtPayment=conversionParams.get("gmt_payment");//交易付款时间
			String gmtRefund=conversionParams.get("gmt_refund");//交易退款时间
			String gmtClose=conversionParams.get("gmt_close");//交易结束时间
			String tradeno=conversionParams.get("trade_no");//支付宝的交易号
			String outTradeNo=conversionParams.get("out_trade_no");//获取商户之前传给支付宝的订单
			String outBizNo=conversionParams.get("out_biz_no");//商户业务号（退款通知中返回退款申请的流水号）
			String buyerLogonId=conversionParams.get("buyer_logon_id");//买家支付宝账号
			String sellerId=conversionParams.get("seller_id");//卖家支付宝账号
			String sellerEmail=conversionParams.get("seller_email");//卖家支付宝账号
			String totalAmount=conversionParams.get("total_amount");//订单金额
			String receiptAmount=conversionParams.get("receipt_amount");//实收金额
			String invoiceAmount=conversionParams.get("invoice_amount");//开票金额
			String buyerPayAmount=conversionParams.get("buyer_pay_amount");//付款金额
			String tradeStatus=conversionParams.get("trade_status");//交易状态
			//需要检验的值（out——trade_no,totalamount,sellerid,appid)
			AlipayOrderBean alipayorder=this.selectByOutTradeNo(outTradeNo);
			if(alipayorder != null && totalAmount.equals(alipayorder.getTotalAmount().toString())&&APP_ID.equals(appId)){
				//alipayorder.setNotifyTime((notifyTime));
				//alipayorder.setGmtCreate(gmtCreate);
				//alipayorder.setGmtPayment(gmtPayment);
				//alipayorder.setGmtRefund(gmtRefund);
				//alipayorder.setGmtClose(gmtClose);
				alipayorder.setTradeNo(tradeno);
				alipayorder.setOutBizNo(outBizNo);
				alipayorder.setBuyerLogonId(buyerLogonId);
				alipayorder.setSellerId(sellerId);
				alipayorder.setSellerId(sellerEmail);
				alipayorder.setTotalAmount(Double.valueOf(totalAmount));
				alipayorder.setReceiptAmount(Double.valueOf(receiptAmount));
				alipayorder.setInvoiceAmount(Double.valueOf(invoiceAmount));
				alipayorder.setBuyerPayAmount(Double.valueOf(buyerPayAmount));
				switch(tradeStatus) {
					case "TRADE_FINISHED" ://交易结束并不能退款
						alipayorder.setTradeStatus((byte) 3);
						break;
					case "TRADE_SUCCESS" ://交易支付成功
						alipayorder.setTradeStatus((byte) 2);
						break;
					case "TRADE_CLOSED" ://未付款 交易超时关闭 支付完成全额退款
						alipayorder.setTradeStatus((byte) 1);
						break;
					case "WAIT_BUYER_PAY" ://交易创建并等待买家付款
						alipayorder.setTradeStatus((byte) 0); 
						break;
					default:
						break;
				}
				int returnResult=this.updateByPrimarykey(alipayorder);
				if(tradeStatus.equals("TRADE_SUCCESS")) {
					if(returnResult>0) {
						return "success";
					}else {
						return "fail";
					}
				}else {
					return "fail";
				}
			}else {
				//日志打印，与校验值不一致，返回fail
				return "fail";
			}
		}else {
			//日志打印验签不通过
			return "fail";
		}
		
	}
	@Override
	public AlipayOrderBean selectByOutTradeNo(String outTradeNo) {
		// TODO Auto-generated method stub
		
		return alipayReporsitory.findByTradeno(outTradeNo);
	}
	@Override
	public int updateByPrimarykey(AlipayOrderBean alipayOrder) {
		// TODO Auto-generated method stub
		return alipayReporsitory.saveAndFlush(alipayOrder);
	}

}

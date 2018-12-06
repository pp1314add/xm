package com.chuange.alipay.bean;

import java.util.Date;

public class AlipayOrderBean {
	public String clubOrderId;//支付宝订单主键
	public String outTradeNo;//订单号
	public Double totalAmount;//订单金额
	public Double receiptAmount;//实收金额
	public Double invoiceAmount;//开票金额
	public Double buyerPayAmount;//付款金额
	public Double refundFee;//退款金额
	public Byte tradeStatus;//交易状态
	private Date notifyTime;//通知时间
	private Date gmtCreate;//交易创建时间
	private Date gmtpayment;//交易付款时间
	private Date gmtRefund;//交易退款时间
	private Date gmtClose;//交易结束时间
	private String tradeNo;//支付宝交易号
	private String outBizNo;//商户业务号
	private String buyerLogonId;//买家支付宝账号
	private String sellerId;//卖家支付宝账户
	public Date getNotifyTime() {
		return notifyTime;
	}
	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtpayment() {
		return gmtpayment;
	}
	public void setGmtpayment(Date gmtpayment) {
		this.gmtpayment = gmtpayment;
	}
	public Date getGmtRefund() {
		return gmtRefund;
	}
	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public Date getGmtClose() {
		return gmtClose;
	}
	public void setGmtClose(Date gmtClose) {
		this.gmtClose = gmtClose;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getOutBizNo() {
		return outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getBuyerLogonId() {
		return buyerLogonId;
	}
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getClubOrderId() {
		return clubOrderId;
	}
	public void setClubOrderId(String clubOrderId) {
		this.clubOrderId = clubOrderId;
	}
	public String getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getReceiptAmount() {
		return receiptAmount;
	}
	public void setReceiptAmount(Double receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public Double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public Double getBuyerPayAmount() {
		return buyerPayAmount;
	}
	public void setBuyerPayAmount(Double buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public Double getRefundFee() {
		return refundFee;
	}
	public void setRefundFee(Double refundFee) {
		this.refundFee = refundFee;
	}
	public Byte getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(Byte tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
}

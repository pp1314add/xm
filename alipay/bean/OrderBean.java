package com.chuange.alipay.bean;

public class OrderBean {
	public String orderId;//订单主键
	public String outTradeNo;//订单号
	public Double totalAmount;//订单金额
	public Double receiptAmount;//实收金额
	public Double invoiceAmount;//开票金额
	public Double buyerPayAmount;//付款金额
	public Double refundFee;//退款金额
	public Byte tradeStatus;//交易状态
	public String body;//	商品具体描述信息
	public String subject;//商品名称
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

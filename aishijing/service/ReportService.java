package com.chuange.aishijing.service;
/**
 * 
 * @author yuany
 * 举报
 *
 */



import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;

public interface ReportService{
	/**
	 * 举报历史
	 */
	public UsersVO queryReport(Integer pagesize,Integer currentPage,String id);
		
}

package com.chuange.aishijing.service;

import com.chuange.aishijing.dto.ReportDTO;
import com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;

/**
 * 
 * @author yuany
 *
 */
public interface VedioReportService {
	/**
	 * 举报管理
	 * @param pagesize
	 * @param currentPage
	 * @param name
	 * @return
	 */
	public UsersVO queryAllBycondition(Integer pagesize,Integer currentPage,ReportDTO report,String category);
	/**
	 * 更新
	 * @param manager
	 */
	public void modifyById(VideoAndCommentReportManager manager);
	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(String id);
}

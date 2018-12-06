//package com.chuange.aishijing.controller.usermanage;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.chuange.aishijing.dto.ReportDTO;
//import com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager;
//import com.chuange.aishijing.service.VedioReportService;
//import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
///**
// *
// * @author yuany
// * 举报管理
// * 0 视频
// * 1 评论
// */
//@Controller
//@SpringBootApplication
//public class VedioReportController {
//	@Autowired
//	private VedioReportService vedioReportService;
//	/**
//	 * 视频举报页面
//	 * @param modelmap
//	 * @return
//	 */
//	@RequestMapping("/vedioReport")
//	public String getVedioReport(ModelMap modelmap) {
//		modelmap.addAttribute("pageNum", 0);
//		modelmap.addAttribute("totalPages", 1);
//		modelmap.addAttribute("totalElements", 0);
//		return "ishijing/usermanage/user_vedio_report";
//	}
//	/**
//	 * 评论举报管理页面
//	 * @param modelmap
//	 * @return
//	 */
//	@RequestMapping("/commentReport")
//	public String getCommentReport(ModelMap modelmap) {
//		modelmap.addAttribute("pageNum", 0);
//		modelmap.addAttribute("totalPages", 1);
//		modelmap.addAttribute("totalElements", 0);
//		return "ishijing/usermanage/user_comment_report";
//	}
//	//模糊查询
//	@RequestMapping(value="/vedioReports")
//	@ResponseBody
//	public UsersVO vedioListByconditions(@RequestParam(value="pageNum",	defaultValue = "1")Integer pageNum,
//			@RequestBody(required=false)ReportDTO report,String category) {
//		Integer pagesize=1;
//		UsersVO vo=vedioReportService.queryAllBycondition(pagesize, pageNum, report,category);
//		return vo;
//	}
//	/**
//	 * 更新处理状态
//	 * @param category
//	 * @param processStatus
//	 * @param reportedid
//	 * @return
//	 */
//	@RequestMapping("/update")
//	public String modifiedById(String category,String processStatus,String id) {
//		String result="";
//		if(processStatus.equals("1")) {
//			result="已冻结";
//		}else if(processStatus.equals("2")) {
//			result="已恢复";
//		}
//		VideoAndCommentReportManager manager=new VideoAndCommentReportManager();
//		manager.setProcessResult(result);
//		manager.setProcessStatus(processStatus);
//		manager.setId(id);
//		vedioReportService.modifyById(manager);
//		if(category.equals("0")) {
//			return "ishijing/usermanage/user_vedio_report";
//		}else {
//			return "ishijing/usermanage/user_comment_report";
//		}
//	}
//	@RequestMapping("/delete")
//	public String deleteById(String id,String category) {
//		vedioReportService.deleteById(id);
//		if(category.equals("0")) {
//			return "ishijing/usermanage/user_vedio_report";
//		}else {
//			return "ishijing/usermanage/user_comment_report";
//		}
//	}
//}

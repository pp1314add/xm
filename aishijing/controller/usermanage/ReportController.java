package com.chuange.aishijing.controller.usermanage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author yuany
 * 	举报
 *
 */
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chuange.aishijing.service.ReportService;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
@Controller
@SpringBootApplication
public class ReportController {
	@Autowired
	private ReportService reportService;
	@RequestMapping(value="/report")
	@ResponseBody
	public UsersVO queryreport(@RequestParam(value="page", defaultValue="1")Integer page,String id) {
		Integer pagesize=1;
		return reportService.queryReport(pagesize, page, id);
	}
}

package com.chuange.aishijing.controller.usermanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chuange.aishijing.service.SealService;
/**
 * 
 * @author yuany
 * 封号
 *
 */
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
@Controller
@SpringBootApplication
public class SealController {
	@Autowired
	private SealService sealService;
	@RequestMapping("/seallog")
	@ResponseBody
	public UsersVO querySeals(String id,Integer page) {
		return sealService.querySeal(1, page, id);
	}
}

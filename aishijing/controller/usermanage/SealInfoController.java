//package com.chuange.aishijing.controller.usermanage;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.chuange.aishijing.dto.ReportDTO;
//import com.chuange.aishijing.pojo.userManage.UserSealInformation;
//import com.chuange.aishijing.pojo.userManage.UserSealInformationLog;
//import com.chuange.aishijing.service.SealInfoService;
//import com.chuange.aishijing.service.SealService;
//import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
//import com.mysql.jdbc.StringUtils;
//
///**
// *
// * @author yuany
// * 封号信息
// *
// */
//@Controller
//@SpringBootApplication
//public class SealInfoController {
//	@Autowired
//	private SealInfoService sealInfoService;
//	@Autowired
//	private SealService sealService;
//	/**
//	 * 查询
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping("/seal")
//	@ResponseBody
//	public UsersVO querySealInfoByUserId(String id) {
//		return sealInfoService.querySealInfoByUserId(id);
//	}
//	/**
//	 * 更新
//	 * @param user
//	 * @return
//	 */
//	@PostMapping("/insertSeal")
//	@ResponseBody
//	public UsersVO saveAndFlush(@RequestBody UserSealInformation seal,
//			@RequestParam(defaultValue="") String operaName,
//			@RequestParam(defaultValue="") String operaTime) {
//		UsersVO vo=sealInfoService.UpdateSealInfo(seal);
//		if(vo.getMsg().equals("success")){
//			UserSealInformationLog seallog=new UserSealInformationLog();
//			String period=seal.getFreezingPeriod();
//			if(StringUtils.isNullOrEmpty(period) ) {
//				seallog.setFreezingPeriod("0");
//			}else {
//				seallog.setFreezingPeriod(seal.getFreezingPeriod());
//
//			}
//			//UUID id=new UUID(16, 1);
//			seallog.setId("2");
//			seallog.setOperaName(operaName);
//			seallog.setOperaTime(operaTime);
//			seallog.setRemark(seal.getRemark());
//			seallog.setUserid(seal.getUserId());
//			sealService.insertSeal(seallog);
//		}
//		return vo;
//	}
//}

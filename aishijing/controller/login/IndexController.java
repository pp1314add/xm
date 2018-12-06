package com.chuange.aishijing.controller.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chuange.aishijing.service.IndexService;
import com.chuange.aishijing.vo.servicevo.index.TreeResponseVO;
/**
 * 
 * @author yuany
 * 跳转至index
 */
@Controller
@SpringBootApplication
public class IndexController {
	@Autowired
	private IndexService indexService;
	@RequestMapping("/index")
	public String index() {
		return "ishijing/index";
	}
	@RequestMapping("/getTree")
	@ResponseBody
	public TreeResponseVO getTreeList(String resourceType){
		
		return indexService.queryTreeListByType(resourceType);
	}
	@RequestMapping("/normalUsers")
	public String toIntroduce() {
		return "ishijing/house_list";
	}
	//注册
	@RequestMapping("/register")
	public String registjump(){
		return "ishijing/register";
	}
	@RequestMapping("/login")
	public String login(){
		return "ishijing/login";
	}
	@RequestMapping("/auditsystem")
	public String auditsystem(){return "ishijing/AuditSystem";}
	@RequestMapping("/starcertified")
	public String starcertified(){return "ishijing/StartCertified";}
	@RequestMapping("/castcertified")
	public String castcertified(){return "ishijing/CastCertified";}
	@RequestMapping("/castmanager")
	public String castmanager(){return "ishijing/CastManager";}
	@RequestMapping("/addcast")
	public String addcast(){return "ishijing/cast_add";}
	@RequestMapping("/editcast")
	public String editcast(ModelMap model,String id){
		System.out.println("编辑id"+id);
		model.addAttribute("editId",id);
		return "ishijing/cast_edit";
	}
	@RequestMapping("/detailcast")
	public String detailcast(ModelMap model,String id){
		model.addAttribute("editId",id);
		return "ishijing/cast_details";
	}

}

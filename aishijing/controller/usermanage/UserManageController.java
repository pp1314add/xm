//package com.chuange.aishijing.controller.usermanage;
//
//
//
//import java.util.Date;
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
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
//import com.chuange.aishijing.dto.UserDTO;
//import com.chuange.aishijing.pojo.userManage.User;
//import com.chuange.aishijing.pojo.userManage.UserLable;
//import com.chuange.aishijing.pojo.userManage.UserMovie;
//import com.chuange.aishijing.service.UserEducationService;
//import com.chuange.aishijing.service.UserManageService;
//import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
///**
// *
// * @author yuany
// * 用户管理
// *
// */
//@Controller
//@SpringBootApplication
//public class UserManageController {
//	@Autowired
//	private UserManageService userManageService;
//	@Autowired
//	private UserEducationService userEducationService;
//	//查询所有用户页面跳转
//	@RequestMapping(value="/normalUsers")
//	public String userList(ModelMap modelmap) {
//		modelmap.addAttribute("pageNum", 0);
//		modelmap.addAttribute("totalPages", 1);
//		modelmap.addAttribute("totalElements", 0);
//		return "ishijing/usermanage/user_list";
//	}
//	//模糊查询
//	@RequestMapping(value="/usersByCondition")
//	@ResponseBody
//	public UsersVO userListByconditions(@RequestParam(value="pageNum",	defaultValue = "1")Integer pageNum,
//			@RequestBody(required=false) UserDTO user) {
//		Integer pagesize=1;
//		if(user==null) {
//			user=new UserDTO();
//		}
//		UsersVO vo=userManageService.queryUserByConditions(pagesize, pageNum,user);
//		return vo;
//	}
//	/**
//	 * 详情查询
//	 */
//	@RequestMapping(value="/user")
//	public String queryUser(ModelMap map,String id) {
//		map.addAttribute("id", id);
//		return "ishijing/usermanage/user";
//	}
//	@RequestMapping(value="/userinfo")
//	@ResponseBody
//	public UsersVO getUser(@RequestParam(value="id")String id) {
//
//		return userManageService.queryById(id);
//	}
//	/**
//	 * 详细信息
//	 */
//	@RequestMapping("/information")
//	@ResponseBody
//	public UsersVO getUserInfo(String id) {
//		//教育 背景
//		UsersVO vo=userEducationService.queryEducationInfo(id);
//		//影视经历
//		List<UserMovie> list=userManageService.queryMovies(id);
//		vo.setMovies(list);
//		//好友印象
//		List<UserLable> friends=userManageService.queryLables(id, "friend");
//		//职业标签
//		List<UserLable> jobs=userManageService.queryLables(id, "job");
//		//特长标签
//		List<UserLable> specials=userManageService.queryLables(id, "special");
//		vo.setFriends(friends);
//		vo.setJobs(jobs);
//		vo.setSpecials(specials);
//		return vo;
//	}
//}

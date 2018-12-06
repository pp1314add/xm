package com.chuange.aishijing.service;



import java.util.List;

import org.springframework.data.domain.Page;

import com.chuange.aishijing.dto.UserDTO;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.userManage.UserLable;
import com.chuange.aishijing.pojo.userManage.UserMovie;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
/**
 * 
 * @author yuany
 * 用户管理逻辑层接口
 *
 */
public interface UserManageService {
	//查询所有用户
	public Page<User> queryUserList(Integer pagesize,Integer currentPage);
	/**
	 * 模糊查询
	 */
	public UsersVO queryUserByConditions(Integer pagesize,Integer currentPage,UserDTO user);
	/**
	 * 用户详情查询
	 */
	public UsersVO queryById(String id);
	/**
	 * 
	 * @param id
	 * @return影视经历
	 */
	public List<UserMovie> queryMovies(String id);
	/**
	 * 
	 * @param id
	 * @param type
	 * @return标签印象
	 */
	public List<UserLable> queryLables(String id,String type);
}

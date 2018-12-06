package com.chuange.aishijing.service.impl.usermanage;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.UserLablesDao;
import com.chuange.aishijing.dao.usermanage.UserManageDao;
import com.chuange.aishijing.dao.usermanage.UserMoviesDao;
import com.chuange.aishijing.dto.UserDTO;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.userManage.UserLable;
import com.chuange.aishijing.pojo.userManage.UserMovie;
import com.chuange.aishijing.service.UserManageService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
import com.mysql.jdbc.StringUtils;

/**
 * 
 * @author yuany
 * 用户管理逻辑层
 *
 */
@Service
@Transactional
public class UserManageServiceImpl implements UserManageService{
	//private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	@Autowired
	//用户基本信息dao
	private UserManageDao userManageDao;
	//影视经历dao
	@Autowired
	private UserMoviesDao userMovieDao;
	//印象标签dao
	@Autowired
	private UserLablesDao userLablesDao;
	@Override
	public Page<User> queryUserList(Integer pagesize, Integer currentPage) {
		// TODO Auto-generated method stub
		//PageHelper.startPage(currentPage, pagesize);
		//根据注册时间排序
		Sort sort = new Sort(Sort.Direction.DESC,"registrationTime");
		@SuppressWarnings("deprecation")
		Pageable pageable =new PageRequest(currentPage - 1,pagesize,sort);
		Page<User> list=userManageDao.findAll(pageable);
		return list;
	}
	@Override
	public UsersVO queryById(String id) {
		// TODO Auto-generated method stub
		UsersVO user=new UsersVO();
		user.success("success", new MD5(user.toString()).compute(), userManageDao.findById(id));
		return user;
	}
	@Override
	public List<UserMovie> queryMovies(String id) {
		// TODO Auto-generated method stub
		return userMovieDao.findAllByUserId(id);
	}
	@Override
	public List<UserLable> queryLables(String id, String type) {
		// TODO Auto-generated method stub
		return userLablesDao.findAllByUseridAndType(id, type);
	}
	@Override
	public UsersVO queryUserByConditions(Integer pagesize, Integer currentPage, UserDTO user) {
		Sort sort = new Sort(Sort.Direction.DESC,"id");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		@SuppressWarnings("deprecation")
		Pageable pageable =new PageRequest(currentPage - 1,pagesize,sort);
		Page<User> pages=userManageDao.findAll(new Specification<User>() {

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> list = new ArrayList<Predicate>();
	            if (!StringUtils.isNullOrEmpty(user.getAgefrom()) && !StringUtils.isNullOrEmpty(user.getAgeto())) {
	                list.add(criteriaBuilder.between(root.get("age").as(String.class), user.getAgefrom(), user.getAgeto()));
	            }else if(!StringUtils.isNullOrEmpty(user.getAgefrom()) && StringUtils.isNullOrEmpty(user.getAgeto())) {
	            	list.add(criteriaBuilder.greaterThanOrEqualTo(root.get("age").as(String.class),  user.getAgefrom()));
	            }else if(StringUtils.isNullOrEmpty(user.getAgefrom()) && !StringUtils.isNullOrEmpty(user.getAgeto())) {
	            	list.add(criteriaBuilder.lessThanOrEqualTo(root.get("age").as(String.class),  user.getAgeto()));
	            }

	            if (user.getLogintimefrom() != null && user.getLogintimeto()!= null) {
					list.add(criteriaBuilder.between(root.get("lastloginTime").as(Date.class), user.getLogintimefrom(), user.getLogintimeto()));
	            }else if(user.getLogintimefrom() != null && user.getLogintimeto()== null) {
		            list.add(criteriaBuilder.greaterThanOrEqualTo(root.get("lastloginTime").as(Date.class),  user.getLogintimefrom()));
	            }else if(user.getLogintimefrom() == null && user.getLogintimeto()!= null) {
	            	list.add(criteriaBuilder.lessThanOrEqualTo(root.get("lastloginTime").as(Date.class), user.getLogintimeto()));
	            }

	            if (user.getRegisttimefrom()!=null && user.getRegisttimeto()!=null) {
					list.add(criteriaBuilder.between(root.get("registrationTime").as(Date.class), user.getRegisttimefrom(), user.getRegisttimeto()));
	            }else if(user.getRegisttimefrom() != null && user.getRegisttimeto()== null) {
		            list.add(criteriaBuilder.greaterThanOrEqualTo(root.get("registrationTime").as(Date.class),  user.getRegisttimefrom()));
	            }else if(user.getRegisttimefrom() == null && user.getRegisttimeto()!= null) {
	            	list.add(criteriaBuilder.lessThanOrEqualTo(root.get("registrationTime").as(Date.class), user.getRegisttimeto()));
	            }

	            Predicate[] p = new Predicate[list.size()];
	            return criteriaBuilder.and(list.toArray(p));
			}
			
		},pageable);
		UsersVO users=new UsersVO();
		users.success("success", new MD5(users.toString()).compute(),pages);
		return users;
	}

}

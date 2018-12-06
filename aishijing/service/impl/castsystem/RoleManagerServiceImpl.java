package com.chuange.aishijing.service.impl.castsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.castsystem.RoleManagerDao;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.service.RoleManagerService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.castsystem.RolesVO;
import com.mysql.jdbc.StringUtils;
@Service
@Transactional
public class RoleManagerServiceImpl implements RoleManagerService{
	@Autowired
	private RoleManagerDao roleManagerDao;
	/**
	 * 条件查询
	 */
	@Override
	public RolesVO queryAllByConditions(Integer pagesize, Integer currentPage, String keywords) {
		Pageable pageable =PageRequest.of(currentPage - 1,pagesize);
		Page<Role> pages=roleManagerDao.findAll(new Specification<Role>() {

			@Override
			public Predicate toPredicate(Root<Role> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(!StringUtils.isNullOrEmpty(keywords)) {
					list.add(criteriaBuilder.like(root.get("castname").as(String.class), "%" + keywords + "%"));
					list.add(criteriaBuilder.like(root.get("roleName").as(String.class), "%" + keywords + "%"));
					Predicate[] p = new Predicate[list.size()];
					return criteriaBuilder.or(list.toArray(p));
				}else {
					Predicate[] p = new Predicate[list.size()];
					return criteriaBuilder.and(list.toArray(p));
				}
			}
			
		},pageable);
		RolesVO roles=new RolesVO();
		roles.success("success", new MD5(roles.toString()).compute(),pages);
		return roles;
	}
	/**
	 * 详情
	 */
	@Override
	public RolesVO queryById(String id) {
		// TODO Auto-generated method stub
		Optional<Role> role= roleManagerDao.findById(id);
		RolesVO vo=new RolesVO();
		vo.success("success", new MD5(vo.toString()).compute(), role);
		return vo;
	}
	/**
	 * 删除
	 */
	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		roleManagerDao.deleteById(id);
	}
	/**
	 * 更新
	 */
	@Override
	public RolesVO updateById(Role role) {
		// TODO Auto-generated method stub
		roleManagerDao.saveAndFlush(role);
		RolesVO vo=new RolesVO();
		vo.success("success");
		return vo;
	}
	/**
	 * 新增
	 */
	@Override
	public RolesVO insert(Role role) {
		// TODO Auto-generated method stub
		RolesVO vo=new RolesVO();
		Role r=roleManagerDao.save(role);
		if(r != null) {
			vo.success("success");
		}
		return vo;
	}

}

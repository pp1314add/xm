package com.chuange.aishijing.service;

import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.vo.servicevo.castsystem.RolesVO;
/**
 * 
 * @author yuany
 * 	角色管理
 *
 */
public interface DramaManagerService {
	/**
	 * 查所有
	 * @param pagesize
	 * @param currentPage
	 * @param keywords
	 * @return
	 */
	public RolesVO queryAllByConditions(Integer pagesize, Integer currentPage, String keywords);
	/**
	 * 详情
	 * @param id
	 * @return
	 */
	public RolesVO queryById(String id);
	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(String id);
	/**
	 * 编辑
	 * @param id
	 */
	public RolesVO updateById(Drama role);
	/**
	 * 新增
	 * @param role
	 * @return
	 */
	public RolesVO insert(Drama role);
}

package com.chuange.aishijing.service;


import com.chuange.aishijing.vo.servicevo.index.TreeResponseVO;

/**
 * 
 * @author yuany
 * index页面逻辑
 *
 */
public interface IndexService {
	public TreeResponseVO queryTreeListByType(String resourceType);
}

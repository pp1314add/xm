package com.chuange.aishijing.service;


import com.chuange.aishijing.vo.servicevo.dics.SelectDictsVO;


/**
 * 
 * @author yuany
 * 字典查询service
 *
 */
public interface SelectDictService {
	public SelectDictsVO selectDictByTypecode(String typeCode);
}

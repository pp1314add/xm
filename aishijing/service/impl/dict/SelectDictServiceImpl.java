package com.chuange.aishijing.service.impl.dict;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.dict.DictDao;
import com.chuange.aishijing.dic.Dictionary;
import com.chuange.aishijing.service.SelectDictService;
import com.chuange.aishijing.util.MD5;
import com.chuange.aishijing.vo.servicevo.dics.SelectDictsVO;
/**
 * 
 * @author yuany
 * 业务字典转map逻辑实现
 *
 */
@Service
@Transactional
public class SelectDictServiceImpl implements SelectDictService{
	@Autowired
	private DictDao dictDao;
	@Override
	public SelectDictsVO selectDictByTypecode(String typeCode) {
		// TODO Auto-generated method stub
		List<Dictionary> list=dictDao.findAllByTypeCode(typeCode);
		SelectDictsVO selectDictsVO=new SelectDictsVO();
		selectDictsVO.success("success", new MD5(selectDictsVO.toString()).compute(),list);
		/*HashMap<String, String> map=new HashMap<>();
		for (Dictionary dictionary : list) {
			map.put(dictionary.getName(), dictionary.getValue());
		}*/
		return selectDictsVO;
	}

}

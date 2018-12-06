package com.chuange.aishijing.dao.dict;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.chuange.aishijing.dic.Dictionary;
@RepositoryDefinition(domainClass=com.chuange.aishijing.dic.Dictionary.class, idClass = Integer.class)
public interface DictDao  extends JpaRepository<Dictionary, String>{
	 List<Dictionary> findAllByTypeCode(String typeCode) ;
}

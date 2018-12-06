package com.chuange.alipay.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import com.chuange.aishijing.pojo.Person;
import com.chuange.alipay.bean.AlipayOrderBean;

@RepositoryDefinition(domainClass = AlipayOrderBean.class, idClass = Integer.class)
public interface AlipayReporsitory extends JpaRepository<Person,String>{
	//生成加签订单
	void save(AlipayOrderBean order);
	//根据订单号查询订单信息
	@Query(value="select * from order_info where outTradeNo=:tradeno",nativeQuery=true)
	AlipayOrderBean findByTradeno(@Param("tradeno") String tradeno);
	//根据主键更新
	@Modifying
    @Transactional
	int saveAndFlush(AlipayOrderBean order);
	
}

package com.chuange.aishijing.dao.orderManager;

import com.chuange.aishijing.pojo.ordermanage.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = Order.class, idClass = String.class)
public interface OrderDao extends JpaRepository<Order,String> {

    public List<Order> findAllByClassId(long classId);

    public List<Order> findAllByClassIdAndPurchaser(long  classId,String purchaser);

}

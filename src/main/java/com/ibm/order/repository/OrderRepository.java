package com.ibm.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.order.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{

	Order findByOrderId(int orderId);
	Order findByUserIdAndUserToken(int userId,String userToken);
}

package com.infosys.infymarket.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.infymarket.order.entity.Order;
@Repository
public interface ReorderRepository extends JpaRepository<Order, String>{
	Order findByOrderid(String orderid);
}

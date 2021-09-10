package com.infosys.infymarket.order.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infosys.infymarket.order.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
	List<Order> findByOrderid(String orderid);
	@Query("FROM Order as order "
   		+ " WHERE order.buyerid = :buyerid and order.address = :address")   
	public Order getOrderByBuyerIdAndAddress(@Param("buyerid") String buyerId,@Param("address") String address);
	
}
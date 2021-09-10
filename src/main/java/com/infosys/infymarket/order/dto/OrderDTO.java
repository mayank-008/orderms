package com.infosys.infymarket.order.dto;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.infosys.infymarket.order.entity.Order;

public class OrderDTO {

	String orderid;
	String buyerid;
	Double amount;
	Date orderdate;
	@NotNull(message = "Please provide delivery address")
	@Max(100)
	String address;
	String status;
	// Integer seller_id;
//	Double quantity;

	public OrderDTO() {
		super();
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Converts Entity into DTO
	public static OrderDTO valueOf(Order orders) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderid(orders.getOrderid());
		orderDTO.setBuyerid(orders.getBuyerid());
		orderDTO.setAmount(orders.getAmount());
		orderDTO.setOrderdate(orders.getOrderdate());
		orderDTO.setAddress(orders.getAddress());
		orderDTO.setStatus(orders.getStatus());
//		orderDTO.setSellerid(orders.getSellerid());
//		orderDTO.setQuantity(orders.getQuantity());
		return orderDTO;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderid=" + orderid + ", buyerid=" + buyerid + ", amount=" + amount + ", orderdate="
				+ orderdate + ", address=" + address + ", status=" + status + "]";
	}

}

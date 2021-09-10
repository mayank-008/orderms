package com.infosys.infymarket.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "orderid")
	String orderid;
	@Column(name = "buyerid",nullable = false)
	String buyerid;
	@Column(nullable = false)
	Double amount;
	@Column(nullable = false)
	Date orderdate;
	@Column(nullable = false)
	String address;
	@Column(nullable = false)
	String status;
	@Column(name = "prodid", nullable = false)
	String prodid;
	@Column(name = "sellerid",nullable = false)
	String sellerid;
	@Column(name = "quality",nullable = false)
	Integer quantity;
	Double price;
	public String getProdid() {
		return prodid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setProdid(String prodid) {
		this.prodid = prodid;
	}

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public Order() {
		super();
	}

	public Order(String orderid, String buyerid, Double amount, Date orderdate, String address, String status) {
		super();
		this.orderid = orderid;
		this.buyerid = buyerid;
		this.amount = amount;
		this.orderdate = orderdate;
		this.address = address;
		this.status = status;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderId(String orderid) {
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

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", buyerid=" + buyerid + ", amount=" + amount + ", orderdate=" + orderdate
				+ ", address=" + address + ", status=" + status + "]";
	}
	
}

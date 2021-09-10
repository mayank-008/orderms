package com.infosys.infymarket.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "productsordered")
public class Productsorder {

		@Id
		@GeneratedValue
		@Column(nullable = false)
		String buyerid;
		@Column(name = "prodid", nullable = false)
		String prodid;
		@Column(name = "sellerid",nullable = false)
		String sellerid;
		@Column(name = "quantity",nullable = false)
		Integer quantity;
		public String getBuyerid() {
			return buyerid;
		}
		public void setBuyerid(String buyerid) {
			this.buyerid = buyerid;
		}
		public String getProdid() {
			return prodid;
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
		@Override
		public String toString() {
			return "Productsorder [buyerid=" + buyerid + ", prodid=" + prodid + ", sellerid=" + sellerid + ", quantity="
					+ quantity + "]";
		}
		
		
}

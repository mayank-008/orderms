package com.infosys.infymarket.order.dto;

import com.infosys.infymarket.order.entity.Productsorder;

public class ProductsorderedDTO {

	String buyerid;

	String prodid;
	
	String sellerid;
	
	Integer quantity;

	public ProductsorderedDTO() {
		super();
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

	
	public String getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}

	public static ProductsorderedDTO valueOf(Productsorder pro) {
		ProductsorderedDTO proorderDTO = new ProductsorderedDTO();
		
		proorderDTO.setBuyerid(pro.getBuyerid());
		proorderDTO.setProdid(pro.getProdid());
		proorderDTO.setQuantity(pro.getQuantity());
		proorderDTO.setSellerid(pro.getSellerid());
		return proorderDTO;
		
	}

	@Override
	public String toString() {
		return "ProductsorderedDTO [buyerid=" + buyerid + ", prodid=" + prodid + ", sellerid=" + sellerid
				+ ", quantity=" + quantity + "]";
	}
	
}

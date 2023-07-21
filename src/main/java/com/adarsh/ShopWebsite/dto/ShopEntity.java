package com.adarsh.ShopWebsite.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShopEntity {
	@Id
	private int id;
	private String name;
	private String quantity;
	private String  price;
	
	public ShopEntity(int id, String name, String quantity, String price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public ShopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	

}

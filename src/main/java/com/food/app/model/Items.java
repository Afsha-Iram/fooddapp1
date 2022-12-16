package com.food.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="items")
public class Items {
	
	@Id
	private String name;
	private String quantity;
	private String price;
	public Items(String name, String quantity, String price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(Object st) {
		this.name = (String) st;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(Object quantity) {
		this.quantity = (String) quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(Object price) {
		this.price = (String) price;
	}

	public Items() {
		
	}
}

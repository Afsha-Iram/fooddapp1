package com.food.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.food.app.Request.NewordersReq;

import lombok.Data;

@Entity
@Table(name="neworders")
@Data
public class Neworders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ordersNo;
	private String restaurantId;
	private String preparationTime;
	private String recivedTime;
	private String orders_id;
	private String deliverStatus;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="neworders_id")
	private Status status;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="neworders_id")
	private List<Items> items;
	
	public Neworders(String restaurantId, String preparationTime, String recivedTime, String orders_id,
			String deliverStatus, Status status, List<Items> items) {
		super();
		this.restaurantId = restaurantId;
		this.preparationTime = preparationTime;
		this.recivedTime = recivedTime;
		this.orders_id = orders_id;
		this.deliverStatus = deliverStatus;
		this.status = status;
		this.items = items;
	}
	
	public Long getOrdersNo() {
		return ordersNo;
	}
	public void setOrdersNo(Long ordersNo) {
		this.ordersNo = ordersNo;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getPreparationTime() {
		return preparationTime;
	}
	public void setPreparationTime(String preparationTime) {
		this.preparationTime = preparationTime;
	}
	public String getRecivedTime() {
		return recivedTime;
	}
	public void setRecivedTime(String recivedTime) {
		this.recivedTime = recivedTime;
	}
	public String getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(String orders_id) {
		this.orders_id = orders_id;
	}
	public String getDeliverStatus() {
		return deliverStatus;
	}
	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Neworders(NewordersReq req) {
		this.deliverStatus=req.getDeliverStatus();
		this.orders_id=req.getOrders_id();
		this.preparationTime=req.getPreparationTime();
		this.recivedTime=req.getRecivedTime();
		this.restaurantId=req.getRestaurantId();
	}
	
	public Neworders() {
		
	}
}

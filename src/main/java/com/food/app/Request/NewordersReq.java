package com.food.app.Request;


import java.util.List;

public class NewordersReq {
    
    private String restaurantId;
    private String preparationTime;
    private String recivedTime;
    private String orders_id;
    private String deliverStatus;
    
    private List<String> items;
    
    private String Status;

	public NewordersReq(String restaurantId, String preparationTime, String recivedTime, String orders_id,
			String deliverStatus, List<String> items, String status) {
		super();
		this.restaurantId = restaurantId;
		this.preparationTime = preparationTime;
		this.recivedTime = recivedTime;
		this.orders_id = orders_id;
		this.deliverStatus = deliverStatus;
		this.items = items;
		Status = status;
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

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	
}
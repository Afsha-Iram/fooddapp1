package com.food.app.Request;

import java.util.List;

public class NewordersReq {
    
    private String restaurantId;
    private String preparationTime;
    private String recivedTime;
    private String orders_id;
    private String deliverStatus;
    
    private List<Item> Items;
    
    private String Status;
    
    public NewordersReq(String restaurantId, String preparationTime, String recivedTime, String orders_id, String deliverStatus, List<Item> items, String status) {
        this.restaurantId = restaurantId;
        this.preparationTime = preparationTime;
        this.recivedTime = recivedTime;
        this.orders_id = orders_id;
        this.deliverStatus = deliverStatus;
        this.Items = items;
        this.Status = status;
    }
    
    public List<Item> getItems() {
        return Items;
    }
    
    public void setItems(List<Item> items) {
        this.Items = items;
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
    
    public String getStatus() {
        return Status;
    }
    
    public void setStatus(String status) {
        Status = status;
    }
    
    public static class Item {
        private String name;
        private String quantity;
        private String price;
        
        public Item(String name, String quantity, String price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getQuantity() {
            return quantity;
        }
        
        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
        
        public String getPrice() {
            return price;
        }
        
        public void setPrice(String price) {
        	this.price = price;
        }
    }}

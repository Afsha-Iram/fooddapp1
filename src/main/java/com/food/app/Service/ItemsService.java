package com.food.app.Service;

import java.util.List;

import com.food.app.model.Items;

public interface ItemsService {
	
	Items save(Items items);
	List<Items> getAll();

}

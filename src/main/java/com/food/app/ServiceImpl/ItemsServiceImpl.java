package com.food.app.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.food.app.Repository.ItemsRepo;
import com.food.app.Request.NewordersReq.Item;
import com.food.app.Service.ItemsService;
import com.food.app.model.Items;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	private ItemsRepo itemsRepo;

	public ItemsServiceImpl(ItemsRepo itemsRepo) {
		super();
		this.itemsRepo = itemsRepo;
	}

	@Override
	public Items save(Items items) {
		
		return itemsRepo.save(items);
	}

	@Override
	public List<Items> getAll() {
		
		return itemsRepo.findAll();
	}


	

}

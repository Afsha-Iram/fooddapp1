package com.food.app.Service;

import java.util.List;

import com.food.app.model.Status;

public interface StatusService {
	

	Status save(Status status);
	
	List<Status> getAll();

}

package com.food.app.Service;

import java.util.List;

import com.food.app.model.Status;

public interface StatusService {
	

	Status saveStatus(Status status);
	
	List<Status> getAll();

}

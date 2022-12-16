package com.food.app.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.food.app.Repository.StatusRepo;
import com.food.app.Service.StatusService;
import com.food.app.model.Status;

@Service
public class StatusServiceImpl implements StatusService{
	
	private StatusRepo statusRepo;

	public StatusServiceImpl(StatusRepo statusRepo) {
		super();
		this.statusRepo = statusRepo;
	}

	@Override
	public Status save(Status status) {
		
		return statusRepo.save(status);
	}

	@Override
	public List<Status> getAll() {
		
		return statusRepo.findAll();
	}
		
	

}

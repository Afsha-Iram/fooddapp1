	package com.food.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.app.Repository.NewordersRepo;
import com.food.app.Service.NewordersService;
import com.food.app.model.Neworders;


@Service
public class NewordersServiceImpl implements NewordersService {
	
	@Autowired
	private NewordersRepo newordersRepo;

	public NewordersServiceImpl(NewordersRepo newordersRepo) {
		super();
		this.newordersRepo = newordersRepo;
	}

	@Override
	public Neworders saveNeworders(Neworders neworders) {
		
		return newordersRepo.save(neworders);
	}

	@Override
	public List<Neworders> getAll() {
		return newordersRepo.findAll();
	}
	
	
	
}

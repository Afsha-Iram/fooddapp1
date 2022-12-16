package com.food.app.Service;

import java.util.List;

import com.food.app.model.Neworders;

public interface NewordersService {
	
	Neworders save (Neworders neworders);
	
	List<Neworders> getAll();
	
	
	

}

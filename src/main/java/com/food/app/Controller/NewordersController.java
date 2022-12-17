package com.food.app.Controller;



import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.app.Request.NewordersReq;

import com.food.app.Service.ItemsService;
import com.food.app.Service.NewordersService;
import com.food.app.Service.StatusService;
import com.food.app.model.Items;
import com.food.app.model.Neworders;
import com.food.app.model.Status;

@RestController
@RequestMapping("/food/app/neworders/status")
public class NewordersController {
	
	private NewordersService newordersSerice;
	private StatusService statusService;
	private ItemsService itemsService;
	
	

	
	public NewordersController(NewordersService newordersSerice, StatusService statusService,
			ItemsService itemsService) {
		super();
		this.newordersSerice = newordersSerice;
		this.statusService = statusService;
		this.itemsService = itemsService;
	}

	@PostMapping
	public ResponseEntity<String> saveNewOrders(@RequestBody NewordersReq req){
		
	       
		
		Status s =new Status();
		s.setAccepted(req.getStatus());
		s.setRejected(req.getStatus());
	
		s=statusService.saveStatus(s);

		
		Neworders n= new Neworders(req);
		n.setStatus(s);
		
		n=newordersSerice.saveNeworders(n);
		
		for (String st: req.getItems()) {
			Items items= new Items();	
			items.setName(st);
			items.setPrice(st);
			items.setQuantity(st);
			items.setNeworders(n);
			
			items=itemsService.saveItems(items);
			}
		
		return new ResponseEntity<String>("saved successfully", HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public  List<Neworders> getAll(){
		return newordersSerice.getAll();
		
	}
}

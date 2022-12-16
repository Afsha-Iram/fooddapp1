package com.food.app.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.app.Request.NewordersReq;
import com.food.app.Request.NewordersReq.Item;
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
	private List<Object> Items = new ArrayList<>();
	

	
	public NewordersController(NewordersService newordersSerice, StatusService statusService,
			ItemsService itemsService) {
		super();
		this.newordersSerice = newordersSerice;
		this.statusService = statusService;
		this.itemsService = itemsService;
	}

	@PostMapping
	public ResponseEntity<String> saveNewOrders(@RequestBody NewordersReq req){
		if (req.getItems() == null) {
	        return new ResponseEntity<String>("items field is null", HttpStatus.BAD_REQUEST);
	    }
		
		Status s =new Status();
		s.setAccepted(req.getStatus());
		s.setRejected(req.getStatus());
	
		s=statusService.save(s);

		
		Neworders n= new Neworders(req);
		n.setStatus(s);
		
		n=newordersSerice.save(n);
		
		for (Item st: req.getItems()) {
			Items i= new Items();	
			i.setName(st);
			i.setPrice(st);
			i.setQuantity(st);
			
			itemsService.save(i);
			}
		
		return new ResponseEntity<String>("saved successfully", HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public  List<Neworders> getAll(){
		return newordersSerice.getAll();
		
	}
}

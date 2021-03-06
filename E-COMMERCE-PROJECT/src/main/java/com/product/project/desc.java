package com.product.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class desc {
	@Autowired
	  
 	ItemService service;

	@GetMapping("/items")
	public List<Item>getById(){
		return service.getAllItems();
	
	}
	@PostMapping("/additems")
	  public void additems( Item item) {
          service.addItem(item);
		
		
		
	}
@PostMapping("/ObjectById/{id}")
public List<Item>getById(Model model ,@PathVariable int id){
	return service.getItemById(id);
}
        
}
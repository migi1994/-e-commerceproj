package com.product.project;



import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ItemService {
    
	private List<Item> items;

	List<Item> getAllItems(){
        	  
          
	      List<Item> items = new ArrayList<Item>();
	      items.add(new Item(1,"Brand: New Balance\r\n"
	      		+ "Description Men's New Balance, 608 Training Shoe."
	      		+ " You'll be ready to move in these comfortable trainers!"
	      		+ " Perfect for walking or everyday wear, this ... ",69.95));
	      items.add(new Item(2,"Puma Axis V3 Running Sneakers Secure Fit Black",70.30));
	      items.add(new Item(3,"NWT Men's Nike Flex Experience Run 4Medium or 4E Wide Width Gray Orange",84.99));
	      items.add(new Item(4,"Men's Nike PG2 Pure Platinum basketball Shoes AJ 2039-002",89.00));
	       
	     
	      items.add(new Item(5,"Puma Women's Ignit Spikless Sport Wmns Golf-Shoes",69.95));
	      items.add(new Item(6,"SKECHERS shoes Women Raspberry Neon Memory",74.00));
	      items.add(new Item(7,"Enrico Coveri Women Jogging Collection Speed Mesh Fashion Sneaker Black Size 9",80.30));
	      items.add(new Item(8,"Us DIRECT MAIL REEBOK/REEBOK m41561_510 indoor fitness workout sports hoses lightweight"
	      		+ "breathable shoes",60.30));
	       return items;
        
	}
       
	public List<Item> getAllItem() {
		return	items;
		
		}

		public List<Item> getItemById(int id) {
		return	getAllItems().stream().filter(item->item.getItemNo()==id)
			.collect(Collectors.toList());
		}

     public String addItem(Item item) {
    	 items.add(item);
		return "successfully added";
}


	
			  
		
		
	  

		
			
		}
	
		


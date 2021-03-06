package com.product.project;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

  @Controller



public class MainController {
@GetMapping("/")
 public String home() {
	 return"home";
 	}
 		
@Autowired

	ItemService service; 	
 	
 	@GetMapping ("/user")
	 public String user() {
	       return"user";
 	}
	@GetMapping ("/admin")
	 public String admin() {
	       return"admin";
}
		 
 	@GetMapping("men")
 	public String getmen(Model model) {
 		
 		return "men";
		}
		 @GetMapping ("women")
		 public String getwomen(Model model) {
			 return"women";
		 }
		
		
	 @GetMapping ("ObjectById")
		 public String getObjectById(Model model) {
			 return"ObjectById";
	 }			
	

}		 
		
		
    		
    	 
    	 
      

		 
		 		 
 


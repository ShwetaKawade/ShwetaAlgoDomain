package com.example.algodomainshop.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.algodomainshop.dto.ProductDetails;
import com.example.algodomainshop.model.CategoryFields;
import com.example.algodomainshop.service.CustomerService;

@RestController
public class SellerController<CategoryFields> {
	
	@Autowired
	CustomerService Customerservice;

	@PostMapping("/product/save")
	public String  saveProduct(@RequestBody ProductDetails productdetails) {
		
		try {
			Customerservice.saveProductDetails(productdetails);
			
		}catch(Exception e) {
			
			return "Program Failed";
			
		}
		
		return "Program Succeed";
	

	}
	@GetMapping("/product/getall")
	public List<CategoryFields>getAllProducts() {
		
		List<CategoryFields> Description = null;
		
		try {
			
			Description = (List<CategoryFields>) Customerservice.getAllProducts();
			
		}catch(Exception e) {
			
			return Description;
		}
	
	return Description;	
		
	}
	
	@PutMapping("product/update")
	public CategoryFields getUpdateDetails() {
		
		CategoryFields Description = null;

		
        try {
			
        	Description = (CategoryFields) Customerservice.getUpdateDetails();
			
		}catch(Exception e) {
			
			return Description;
		}
	
        return Description;
	
	}
	@DeleteMapping("product/delete")
	public boolean getDeleteDetails() {
		
		return true;
	
	}	
		

}


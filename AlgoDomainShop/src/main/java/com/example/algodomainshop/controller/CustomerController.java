package com.example.algodomainshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.algodomainshop.model.CategoryFields;
import com.example.algodomainshop.service.CustomerService;
@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerService CustomerService;
	
	@GetMapping("algodomshop/{id}")
	public CategoryFields getproductdetails(@PathVariable int id) {
		CategoryFields Description = null;
		try {
			Description = CustomerService.getProductDetails(id);
		}catch(Exception e) {
			return Description;
		}
	
	return Description;	
	}

}

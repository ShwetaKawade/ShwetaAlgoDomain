package com.example.algodomainshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.algodomainshop.dto.ProductDetails;
import com.example.algodomainshop.model.CategoryFields;

@Service
public interface CustomerService {

		public void  saveProductDetails( ProductDetails productdetails);
		
		public CategoryFields getProductDetails(int id);

		public CategoryFields getProductDetails(ProductDetails productdetails);

		public CategoryFields getProductDetails1(String id);
		
		public List<CategoryFields>getAllProducts();
		
		public boolean getDeleteDetails();
		
		public CategoryFields getUpdateDetails();

		CategoryFields getProductDetails1(Integer id);
		

	}

	

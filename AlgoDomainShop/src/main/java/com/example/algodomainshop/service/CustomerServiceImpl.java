package com.example.algodomainshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algodomainshop.dto.ProductDetails;
import com.example.algodomainshop.model.CategoryFields;
import com.example.algodomainshop.model.ProductCategory;
import com.example.algodomainshop.repo.CategoryFieldsRepo;
import com.example.algodomainshop.repo.ProductCategoryRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	 ProductCategoryRepo Category;

	@Autowired
	CategoryFieldsRepo cfrepo;

	@Override
	public void saveProductDetails(ProductDetails productdetails) {
		// TODO Auto-generated method stub
		
	ProductCategory cat =  Category.getById(productdetails.getId());
	
	ProductCategory c= new ProductCategory();
	
	c.setId(productdetails.getId());
	c.setProductName(productdetails.getProductName());
	c.setProductType(productdetails.getProductType());
	c.setProductCategory(productdetails.getProductCategory());
	c.setProductPrice(productdetails.getProductPrice());
	
	CategoryFields cf= new CategoryFields();
	cf.setId(productdetails.getId());
	cf.setProId(productdetails.getProId());
	cf.setBrandName(productdetails.getBrandName());
	cf.setType(productdetails.getType());
	cf.setSubCategory(productdetails.getSubCategory());
	cf.setProFields(productdetails.getProFields());
	
	Category.save(c);
	cfrepo.save(cf);
	}
	@Override
	public CategoryFields getProductDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CategoryFields getProductDetails(ProductDetails productdetails) {
		// TODO Auto-generated method stub
		return cfrepo.getById(null);
	}

	@Override
	public CategoryFields getProductDetails1(Integer id) {
		// TODO Auto-generated method stub
		return cfrepo.getById(id);
	}

	@Override
	public List<CategoryFields> getAllProducts() {
		// TODO Auto-generated method stub
		return cfrepo.findAll();
	}

	@Override
	public boolean getDeleteDetails() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CategoryFields getUpdateDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CategoryFields getProductDetails1(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}


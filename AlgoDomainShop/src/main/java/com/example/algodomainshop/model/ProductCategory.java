package com.example.algodomainshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table
public class ProductCategory {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	int Id;
	String productName;
	String productType;
	String productCategory;
	int productPrice;
	
	
	public ProductCategory(int id, String productName, String productType, String productCategory, int productPrice) {
		super();
		Id = id;
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}
	public ProductCategory() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
		
	
}


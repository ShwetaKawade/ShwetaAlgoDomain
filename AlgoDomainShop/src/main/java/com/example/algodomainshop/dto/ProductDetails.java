package com.example.algodomainshop.dto;

public class ProductDetails {
		int Id;
		int ProId;
		String BrandName;
		String type;
		String SubCategory;
		String productName;
		String productType;
		String productCategory;
		int productPrice;
		String ProFields;
		
		public ProductDetails(String proFields) {
			super();
			ProFields = proFields;
		}
		public String getProFields() {
			return ProFields;
		}
		public void setProFields(String proFields) {
			ProFields = proFields;
		}
		public ProductDetails(int id, int proId, String brandName, String type, String subCategory, String productName,
				String productType, String productCategory, int productPrice) {
			super();
			Id = id;
			ProId = proId;
			BrandName = brandName;
			this.type = type;
			SubCategory = subCategory;
			this.productName = productName;
			this.productType = productType;
			this.productCategory = productCategory;
			this.productPrice = productPrice;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public int getProId() {
			return ProId;
		}
		public void setProId(int proId) {
			ProId = proId;
		}
		public String getBrandName() {
			return BrandName;
		}
		public void setBrandName(String brandName) {
			BrandName = brandName;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getSubCategory() {
			return SubCategory;
		}
		public void setSubCategory(String subCategory) {
			SubCategory = subCategory;
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


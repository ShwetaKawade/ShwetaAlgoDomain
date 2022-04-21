package com.example.algodomainshop.model;

	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table
	public class CategoryFields {
		@Id
		int Id;
		int ProId;
		String BrandName;
		String type;
		String SubCategory;
		String ProFields;
		
		public CategoryFields(String proFields) {
			super();
			ProFields = proFields;
		}
		public String getProFields() {
			return ProFields;
		}
		public void setProFields(String proFields) {
			ProFields = proFields;
		}
		public CategoryFields(int id, int proId, String brandName, String type, String subCategory) {
			super();
			Id = id;
			ProId = proId;
			BrandName = brandName;
			this.type = type;
			SubCategory = subCategory;
		}
		public CategoryFields() {
			// TODO Auto-generated constructor stub
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
		
	}


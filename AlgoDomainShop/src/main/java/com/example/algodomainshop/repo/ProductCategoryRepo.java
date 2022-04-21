package com.example.algodomainshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algodomainshop.model.ProductCategory;

@Repository
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer>{
	ProductCategory getById(int id);
}

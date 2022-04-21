package com.example.algodomainshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algodomainshop.model.CategoryFields;

@Repository
public interface CategoryFieldsRepo extends JpaRepository<CategoryFields,Integer>{

}

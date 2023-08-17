package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Category;
import com.example.services.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService cat_service;
	
	@GetMapping(value="api/getCatergories")
	public List<Category> getCategories(){
		return cat_service.getCategories();
	}
	
	@GetMapping(value = "api/getCategoryByName/{cName}")
	public List<Category> getCategoryByName(@PathVariable String cName){
		return cat_service.getCategoryByName(cName);
	}
	
	@GetMapping(value = "api/getCategoryByName/{cId}")
	public Optional<Category> getCategoryByName(@PathVariable int cId){
		return cat_service.getCategoryById(cId);
	}
}

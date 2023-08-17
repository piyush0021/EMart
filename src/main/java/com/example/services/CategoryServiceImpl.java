package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Category;
import com.example.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository c_repository;
	
	@Override
	public List<Category> getCategories() {
		return c_repository.findAll();
	}
	
	@Override
	public List<Category> getCategoryByName(String cName) {
		return c_repository.findBycategoryName(cName);
	}
	
	@Override
	public Optional<Category> getCategoryById(int cId) {
		return c_repository.findById(cId);
	}
	
}

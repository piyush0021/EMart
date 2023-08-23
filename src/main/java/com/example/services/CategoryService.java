package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Category;

public interface CategoryService {
	List<Category> getCategories();
	List<Category> getCategoryBySubcatId(String subcatId);
	List<Category> getCategoryByName(String cName);
	Optional<Category> getCategoryById(int cId);
}

package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Product;
import com.example.repositories.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository p_repository;
	
	@Override
	public List<Product> getAllProducts() {
		return p_repository.findAll();
	}

	@Override
	public List<Product> getAllProductsByName(String pName) {
		return p_repository.findByName(pName);
	}

	@Override
	public Optional<Product> getAllProductsById(int pId) {
		return p_repository.findById(pId);
	}
	

}

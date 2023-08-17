package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.entities.Product;


public interface ProductService {
	List<Product> getAllProducts();
	List<Product> getAllProductsByName(String pName);
	Optional<Product> getAllProductsById (int pId);
}

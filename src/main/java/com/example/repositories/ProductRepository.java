package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	 List<Product> findByProdName(String desc);
}

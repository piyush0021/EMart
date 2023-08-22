package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Category;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	List<Category> findBycategoryName(String cName);
	
	@Query("SELECT c FROM Category c WHERE c.subcat_Id IS NULL")
	List<Category> findBysubcatIdIsNull();
}

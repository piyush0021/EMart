package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	 List<Product> findByProdName(String desc);
	 
	 @Query(value = "select * from product_master p join category_master c on p.catmaster_id=c.catmaster_id  and c.subcat_id=:cat", nativeQuery = true)
	 List<Product> findProductsBySubcategory(@Param("cat") String cat);

}

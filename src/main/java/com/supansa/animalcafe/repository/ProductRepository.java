package com.supansa.animalcafe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.supansa.animalcafe.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM Product p WHERE CONCAT(p.productname,' ',p.productdescription,' ',p.productprice) LIKE %?1%")
	public List<Product> search(String keyword);
}

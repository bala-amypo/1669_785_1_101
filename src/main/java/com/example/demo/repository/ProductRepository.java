package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.jpa.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
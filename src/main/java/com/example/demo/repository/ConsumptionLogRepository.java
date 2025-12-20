package com.example.demo.repository;

import com.example.demo.model.Cons;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
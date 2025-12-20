package com.example.demo.service.impl;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.ProductService;
import com.example.demo.repository.ProductRepository;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired ProductRepository pro;
    @Override
    Product createProduct(Product product){
        return pro.save(product);
    }
    @Override
    Product getProduct(Long id){
        return pro.findById(id);
    }
    @Override
    List<Product> getAllProducts(){
        return pro.findAll();
    }
}
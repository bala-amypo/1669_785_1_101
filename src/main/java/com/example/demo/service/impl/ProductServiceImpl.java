package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.ProductService;
import com.example.demo.repository.ProductRepository;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired ProductRepository pro;
    @Override
    public Product createProduct(Product product){
        return pro.save(product);
    }
    @Override
    public Product getProduct(Long id){
        return pro.findById(id).orElseThrow(()->new ResourceNotFoundException("Product Not Found"));
    }
    @Override
    public List<Product> getAllProducts(){
        return pro.findAll();
    }
}
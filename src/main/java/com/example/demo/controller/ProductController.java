package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import com.example.demo.repository.ProductRepository;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired ProductService serve;
    @PostMapping("/api/products/post")
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
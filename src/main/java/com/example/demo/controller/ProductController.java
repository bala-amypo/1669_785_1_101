package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class ProductController{
    @Autowired ProductService serve;
    @PostMapping("/api/products/POST")
    Product createproduct(@RequestBody Product product){
        return serve.createProduct(product);
    }
    @GetMapping("/api/products/GET/{id}")
    Product getproduct(@PathVariable Long id){
        return serve.getProduct(id);
    }
    @GetMapping("/api/products/GET")
    List<Product> listAllProducts(){
        return serve.getAllProducts();
    }
}
package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import com.example.demo.repository.ProductRepository;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired ProductService serve;
    @PostMapping("/api/products/POST")
    Product createproduct(Product product){
        return serve.createProduct(product);
    }
    @GetMapping("/api/products/GET")
    Product getproduct(Long id){
        return serve.getProduct(id);
    }
    @GetMapping("/api/products/GET")
    List<Product> listAllProducts(){
        return serve.getAllProducts();
    }
}
package com.example.demo.service.impl;

import com.example.demo.model.Product;
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
        int di=pro.findById()
        return ;
    }
    @Override
    List<Product> getAllProducts(){
        return pro;
    }
}
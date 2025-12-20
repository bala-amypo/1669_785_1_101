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
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/products")
@Tag(name = "Product")
public class ProductController {

private final ProductService productService;

public ProductController(ProductService productService) {
this.productService = productService;
}

@PostMapping
public Product create(@RequestBody Product product) {
return productService.createProduct(product);
}

@GetMapping
public List<Product> getAll() {
return productService.getAllProducts();
}

@GetMapping("/{id}")
public Product get(@PathVariable Long id) {
return productService.getProduct(id);
}
}
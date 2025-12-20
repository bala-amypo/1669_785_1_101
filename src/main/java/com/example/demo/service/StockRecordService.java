package com.example.demo.service;

import com.example.demo.model.StockRecord;
import java.util.List;
public interface StockRecordService{
    StockRecord createStockRecord(Product product);
    Product getProduct(Long id);
    List<Product> getAllProducts();
}
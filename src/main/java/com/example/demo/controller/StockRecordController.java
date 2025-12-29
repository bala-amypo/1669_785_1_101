package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import com.example.demo.model.StockRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Warehouse;
import com.example.demo.model.Product;
import com.example.demo.service.StockRecordService;
import com.example.demo.service.ProductService;
import com.example.demo.service.WarehouseService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import lombok.*;
import java.util.List;

@RestController

@RequestMapping("/api/stocks")
@SecurityRequirement(name="bearerAuth")
public class StockRecordController {
    @Autowired ProductService productService;
    @Autowired WarehouseService warehouseService;
    private final StockRecordService stockRecordService;

    public StockRecordController(StockRecordService stockRecordService) {
        this.stockRecordService = stockRecordService;
    }

    @PostMapping("/{productId}/{warehouseId}")
    public StockRecord create(@PathVariable Long productId,
                              @PathVariable Long warehouseId,
                              @RequestBody StockRecord record) {
        return stockRecordService.createStockRecord(productId, warehouseId, record);
    }

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable Long productId) {
        return productService.getProduct(productId);
    }
    // public List<StockRecord> byProduct(@PathVariable Long productId) {
    //     return stockRecordService.getRecordsBy_product(productId);
    // }

    @GetMapping("/warehouse/{warehouseId}")
    public Warehouse getware(@PathVariable Long warehouseId) {
return warehouseService.getWarehouse(warehouseId);
}
    // public List<StockRecord> byWarehouse(@PathVariable Long warehouseId) {
    //     return stockRecordService.getRecordsByWarehouse(warehouseId);
    // }

    @GetMapping("/{id}")
    // public StockRecord get(@PathVariable Long id) {
    //     return stockRecordService.getStockRecord(id);
    // }
   
 public ResponseEntity<StockRecord> getStockRecordById(@PathVariable Long id) {
        // Removed: logger.info("Fetching stock record with id: {}", id);
        
        try {
            StockRecord stockRecord = stockRecordService.getStockRecord(id);
            return ResponseEntity.ok(stockRecord);
        } catch (ResourceNotFoundException ex) {
            // Removed: logger.error("Stock record not found with id: {}", id, ex);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } catch (Exception ex) {
            // Removed: logger.error("Error fetching stock record with id: {}", id, ex);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

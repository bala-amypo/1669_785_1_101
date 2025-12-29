package com.example.demo.controller;

import com.example.demo.model.StockRecord;
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
@Slf4j 
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
   
public ResponseEntity<StockRecord> getStockById(@PathVariable Long id) {
    try {
        StockRecord stock = stockRecordService.findById(id);
        if (stock == null) {
            return ResponseEntity.notFound().build(); // Should return 404, not 500
        }
        return ResponseEntity.ok(stock);
    } catch (Exception e) {
        // Log the actual error
        logger.error("Error fetching stock with id: " + id, e);
        return ResponseEntity.internalServerError().build();
    }
}
}

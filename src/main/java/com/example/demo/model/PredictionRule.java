package com.example.demo.model;


import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class PredictionRule{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ruleName;
    private Integer averageDaysWindow;
    private Integer minDailyUsage;
    private Integer maxDailyUsage;
    private LocalDateTime createdAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    
    public String getRuleName(){
        return product;
    }
    public void setProduct(Product product){
        this.product=product;
    }
    public Integer getCurrentQuantity(){
        return currentQuantity;
    }
    public void setCurrentQuantity(Integer currentQuantity){
        this.currentQuantity=currentQuantity;
    }
    public Integer getReorderThreshold(){
        return reorderThreshold;
    }
    public void setReorderThreshold(Integer reorderThreshold){
        this.reorderThreshold=reorderThreshold;
    }
    public LocalDateTime getLastUpdated(){
        return lastUpdated;
    }
    public void setLastUpdated(LocalDateTime lastUpdated){
        this.lastUpdated=lastUpdated;
    }
    public StockRecord(){
        
    }
    public StockRecord(Long id,Warehouse warehouse,Product product,Integer currentQuantity,Integer reorderThreshold,LocalDateTime lastUpdated){
        this.id=id;
        this.warehouse=warehouse;
        this.currentQuantity=currentQuantity;
        this.reorderThreshold=reorderThreshold;
        this.lastUpdated=lastUpdated;
    }
}
package com.example.demo.model;


import jakarta.persistance.Id;
import jakarta.persistence.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;
import jakarta.persistance.ManyToOne;
import java.time.LocalDateTime;
import com.example.demo.model.Product;
import com.example.demo.model.Warehouse;
@Entity
public class StockRecord{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false)
    private Warehouse warehouse;
    @ManyToOne(optional=false)
    private Product product;
    private Integer currentQuantity;
    private Integer reorderThreshold;
    private LocalDateTime lastUpdated;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Warehouse getWarehouse(){
        return warehouse;
    }
    public void setWarehouse(Warehouse warehouse){
        this.warehouse=warehouse;
    }
    public Product getProduct(){
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
        this.warehouseName=warehouseName;
        this.currentQuantity=currentQuantity;
        this.reorderThreshold=reorderThreshold;
        this.lastUpdated=lastUpdated;
    }
}
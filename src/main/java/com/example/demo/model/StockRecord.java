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
public class Warehouse{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false)
    private Warehouse warehouse;
    @ManyToOne(optional=false)
    private ProductEntity product;
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
    public void setWarehouse( warehouse){
        this.warehouse=warehouse;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public StockRecord(){
        
    }
    public StockRecord(Long id,String warehouseName,String location,LocalDateTime createdAt){
        this.id=id;
        this.warehouseName=warehouseName;
        this.location=location;
        this.createdAt=createdAt;
    }
}
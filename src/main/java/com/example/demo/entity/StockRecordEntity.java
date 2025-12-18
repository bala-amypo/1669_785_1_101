package com.example.demo.entity;


import jakarta.persistance.Id;
import jakarta.persistence.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;
import jakarta.persistance.ManyToOne;
import java.time.LocalDateTime;
import com.example.demo.entity.ProductEntity;
@Entity
public class WarehouseEntity{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String warehouse;
    @ManyToOne(optional=false)
    private ProductEntity product;
    private Integer currentQuality;
    private Integer reorderThreshold;
    private LocalDateTime lastUpdated;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getWarehouse(){
        return warehouse;
    }
    public void setWarehouse(String warehouse){
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
    public StockEntity(){
        
    }
    public WarehouseEntity(Long id,String warehouseName,String location,LocalDateTime createdAt){
        this.id=id;
        this.warehouseName=warehouseName;
        this.location=location;
        this.createdAt=createdAt;
    }
}
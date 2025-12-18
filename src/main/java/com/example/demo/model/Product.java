package com.example.demo.model
;


import jakarta.persistance.Id;
import jakarta.persistence.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;
import java.time.LocalDateTime;

@Entity
public class ProductEntity{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String sku;
    private String category;
    private LocalDateTime createdAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku=sku;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public ProductEntity(){
        
    }
    public ProductEntity(Long id,String warehouseName,String sku,String category,LocalDateTime createdAt){
        this.id=id;
        this.warehouseName=warehouseName;
        this.sku=sku;
        this.category=category;
        this.createdAt=createdAt;
    }
}
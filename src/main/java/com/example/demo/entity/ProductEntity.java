package com.example.demo.entity;

import java.util.L;
import org.springframework.web.bind.annotation.Id;
import jakarta.persistance.Id;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;

import java.time.LocalDateTime;
@Entity
public class ProductEntity{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    private String warehouseName;
    private String location;
    private LocalDateTime createdAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getWarehouseName(){
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName){
        this.warehouseName=warehouseName;
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
    public void setCreatedAt(Long id){
        this.id=id;
    }
}
package com.example.demo.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.JoinColumn;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
@Entity
@
public class Product{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String productName;
    @Column(name='sku',unique=true)
    private String sku;
    private String category;
    private LocalDateTime createdAt;

    
}
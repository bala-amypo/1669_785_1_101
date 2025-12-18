package com.example.demo.entity;

@Entity
public class ProductEntity{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    private String warehouseName;
    private String location;
    private LocalDate 
}
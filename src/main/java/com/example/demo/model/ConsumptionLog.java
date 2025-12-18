package com.example.demo.model;

import com.example.demo.model.StockRecord;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class ConsumptionLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false)
    private StockRecord stockRecord;
    private Integer consumedQuantity;
    private LocalDateTime consumedDate;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public StockRecord getStockRecord(){
        return stockRecord;
    }
    public void setStockRecord(StockRecord stockRecord){
        this.stockRecord=stockRecord;
    }
    
    public Integer getConsumedQuantity(){
        return consumedQuantity;
    }
    public void setConsumedQuantity(Integer consumedQuantity){
        this.consumedQuantity=consumedQuantity;
    }
    
    public LocalDateTime getConsumedDate(){
        return consumedDate;
    }
    public void setConsumedDate(LocalDateTime consumedDate){
        this.consumedDate=consumedDate;
    }
    public ConsumptionLog(){
        
    }
    public ConsumptionLog(Long id,StockRecord stockRecord,Integer consumedQuantity,LocalDateTime consumedDate){
        this.id=id;
        this.stockRecord=stockRecord;
        this.consumedQuantity=consumedQuantity;
        this.consumedDate=consumedDate;
    }
}
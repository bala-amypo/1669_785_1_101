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
    private String name;
    private String email;
    private String password;
    private Set<Role>
    private LocalDateTime createdAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    
    public String getName(){
        return ruleName;
    }
    public void setRuleName(String ruleName){
        this.ruleName=ruleName;
    }
    public Integer getAverageDaysWindow(){
        return averageDaysWindow;
    }
    public void setAverageDaysWindow(Integer averageDaysWindow){
        this.averageDaysWindow=averageDaysWindow;
    }
    public Integer getMinDailyUsage(){
        return minDailyUsage;
    }
    public void setMinDailyUsage(Integer minDailyUsage){
        this.minDailyUsage=minDailyUsage;
    }
    public Integer getMaxDailyUsage(){
        return maxDailyUsage;
    }
    public void setMaxDailyUsage(Integer maxDailyUsage){
        this.maxDailyUsage=maxDailyUsage;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime lastUpdated){
        this.createdAt=createdAt;
    }
    public PredictionRule(){
        
    }
    public PredictionRule(Long id,String ruleName,Integer averageDaysWindowInteger,Integer minDailyUsage,Integer maxDailyUsage,LocalDateTime createdAt){
        this.id=id;
        this.ruleName=ruleName;
        this.averageDaysWindow=averageDaysWindow;
        this.minDailyUsage=minDailyUsage;
        this.maxDailyUsage=maxDailyUsage;
        this.createdAt=createdAt;
    }
}
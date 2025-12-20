package com.example.demo.repository;

import com.example.demo.model.StockRecord;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StockRecordRepository extends JpaRepository<StockRecord,Long>{

}
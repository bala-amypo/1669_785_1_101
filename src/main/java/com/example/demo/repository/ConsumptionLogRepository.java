package com.example.demo.repository;

import com.example.demo.model.ConsumptionLog;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ConsumptionLogRepository extends JpaRepository<ConsumptionLog,Long>{

}
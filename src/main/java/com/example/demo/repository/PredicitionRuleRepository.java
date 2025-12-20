package com.example.demo.repository;

import com.example.demo.model.PredicitionRule;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PredicitionRuleRepository extends JpaRepository<PredicitionRule,Long>{

}
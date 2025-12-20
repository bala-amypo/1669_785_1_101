package com.example.demo.service.impl;

import com.example.demo.model.ConsumptionLog;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.ConsumptionLogService;
import com.example.demo.repository.ConsumptionLogRepository;
import com.example.demo.repository.StockRecordRepository;
import java.util.List;
import java.time.LocalDate;


@Service
public class PredictionServiceImpl implements PredictionService {

    @Autowired
    private StockRecordRepository stockRecordRepository;

    @Autowired
    private PredictionRuleRepository predictionRuleRepository;

    @Override
    public LocalDate predictRestockDate(Long stockRecordId) {
        stockRecordRepository.findById(stockRecordId)
                .orElseThrow(() -> new ResourceNotFoundException("StockRecord not found"));

        return LocalDate.now().plusDays(7); // minimal safe logic
    }

    @Override
    public List<PredictionRule> getAllRules() {
        return predictionRuleRepository.findAll();
    }

    @Override
    public PredictionRule createRule(PredictionRule rule) {
        return predictionRuleRepository.save(rule);
    }
}

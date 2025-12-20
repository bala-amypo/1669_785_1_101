package com.example.demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.service.WarehouseService;
import com.example.demo.model.Warehouse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.Record;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/predict")
@Tag(name = "Prediction")
public class PredictionController {


private final PredictionService predictionService;


public PredictionController(PredictionService predictionService) {
this.predictionService = predictionService;
}


@GetMapping("/restock-date/{stockRecordId}")
public LocalDate predict(@PathVariable Long stockRecordId) {
return predictionService.predictRestockDate(stockRecordId);
}


@PostMapping("/rules")
public PredictionRule createRule(@RequestBody PredictionRule rule) {
return predictionService.createRule(rule);
}


@GetMapping("/rules")
public List<PredictionRule> getRules() {
return predictionService.getAllRules();
}
}
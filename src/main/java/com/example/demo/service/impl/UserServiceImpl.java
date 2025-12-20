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

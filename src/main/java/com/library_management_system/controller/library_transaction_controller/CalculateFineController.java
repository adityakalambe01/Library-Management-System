package com.library_management_system.controller.library_transaction_controller;

import com.library_management_system.service.library_transaction_service.CalculateFineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateFineController {
    @Autowired
    CalculateFineService calculateFineService;
    @RequestMapping(value = "/calculateFine/{transactionId}", method = RequestMethod.GET)
    public Double calculateFine(@PathVariable Long transactionId){
        return calculateFineService.calculateFine(transactionId);
    }
}

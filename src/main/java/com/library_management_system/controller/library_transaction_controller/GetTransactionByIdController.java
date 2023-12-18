package com.library_management_system.controller.library_transaction_controller;

import com.library_management_system.entity.LibraryTransaction;
import com.library_management_system.service.library_transaction_service.GetTransactionByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTransactionByIdController {
    @Autowired
    GetTransactionByIdService getTransactionByIdService;
    @RequestMapping(value = "/getTransactionById/{transactionId}", method = RequestMethod.GET)
    public LibraryTransaction getTransactionById(@PathVariable Long transactionId){
        return getTransactionByIdService.getTransactionById(transactionId);
    }
}

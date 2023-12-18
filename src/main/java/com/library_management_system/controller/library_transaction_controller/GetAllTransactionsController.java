package com.library_management_system.controller.library_transaction_controller;

import com.library_management_system.entity.LibraryTransaction;
import com.library_management_system.service.library_transaction_service.GetAllTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllTransactionsController {
    @Autowired
    GetAllTransactionsService getAllTransactionsService;
    @RequestMapping(value = "/getAllTransactions", method = RequestMethod.GET)
    public List<LibraryTransaction> getAllTransactions(){
        return getAllTransactionsService.getAllTransactions();
    }
}

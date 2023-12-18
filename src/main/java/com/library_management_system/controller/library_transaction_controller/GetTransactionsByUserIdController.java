package com.library_management_system.controller.library_transaction_controller;

import com.library_management_system.entity.LibraryTransaction;
import com.library_management_system.service.library_transaction_service.GetTransactionsByUserIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetTransactionsByUserIdController {
    @Autowired
    GetTransactionsByUserIdService getTransactionsByUserIdService;
    @RequestMapping(value = "/getTransactionsByUserId/{userId}", method = RequestMethod.GET)
    public List<LibraryTransaction> getTransactionsByUserId(@PathVariable Long userId){
        return getTransactionsByUserIdService.getTransactionsByUserId(userId);
    }
}

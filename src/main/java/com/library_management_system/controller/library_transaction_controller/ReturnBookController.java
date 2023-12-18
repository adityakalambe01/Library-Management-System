package com.library_management_system.controller.library_transaction_controller;

import com.library_management_system.service.library_transaction_service.ReturnBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnBookController {
    @Autowired
    ReturnBookService returnBookService;
    @RequestMapping(value = "/returnBook/{transactionId}", method = RequestMethod.PUT)
    public String returnBook(@PathVariable Long transactionId){
        return returnBookService.returnBook(transactionId);
    }
}

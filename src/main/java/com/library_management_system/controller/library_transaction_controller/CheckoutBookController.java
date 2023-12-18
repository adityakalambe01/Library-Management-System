package com.library_management_system.controller.library_transaction_controller;

import com.library_management_system.service.library_transaction_service.CheckoutBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutBookController {
    @Autowired
    CheckoutBookService checkoutBookService;
    @RequestMapping(value = "/checkoutBook/{userId}/{bookId}", method = RequestMethod.POST)
    public Boolean checkoutBook(@PathVariable Long userId,@PathVariable Long bookId){
        return checkoutBookService.checkoutBook(userId, bookId);
    }
}

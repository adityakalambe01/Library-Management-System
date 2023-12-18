package com.library_management_system.service.library_transaction_service;

import com.library_management_system.dao.library_transactions_dao.CheckoutBookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutBookService {
    @Autowired
    CheckoutBookDAO checkoutBookDAO;
    public Boolean checkoutBook(Long userId, Long bookId){
        return checkoutBookDAO.checkoutBook(userId,bookId);
    }
}

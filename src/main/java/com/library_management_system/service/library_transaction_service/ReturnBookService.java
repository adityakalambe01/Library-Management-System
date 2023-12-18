package com.library_management_system.service.library_transaction_service;

import com.library_management_system.dao.library_transactions_dao.ReturnBookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnBookService {
    @Autowired
    ReturnBookDAO returnBookDAO;
    public String returnBook(Long transactionId){
        if(returnBookDAO.returnBook(transactionId)==null)
            return "Invalid Transaction Id";
        return "Inserted";
    }
}

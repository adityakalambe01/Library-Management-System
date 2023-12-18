package com.library_management_system.service.library_transaction_service;

import com.library_management_system.dao.library_transactions_dao.GetTransactionByIdDAO;
import com.library_management_system.entity.LibraryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetTransactionByIdService {
    @Autowired
    GetTransactionByIdDAO getTransactionByIdDAO;
    public LibraryTransaction getTransactionById(Long transactionId){
        return getTransactionByIdDAO.getTransactionById(transactionId);
    }
}

package com.library_management_system.service.library_transaction_service;

import com.library_management_system.dao.library_transactions_dao.GetAllTransactionsDAO;
import com.library_management_system.entity.LibraryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllTransactionsService {
    @Autowired
    GetAllTransactionsDAO getAllTransactionsDAO;
    public List<LibraryTransaction> getAllTransactions(){
        return getAllTransactionsDAO.getAllTransactions();
    }
}

package com.library_management_system.service.library_transaction_service;

import com.library_management_system.dao.library_transactions_dao.GetTransactionsByUserIdDAO;
import com.library_management_system.entity.LibraryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTransactionsByUserIdService {
    @Autowired
    GetTransactionsByUserIdDAO getTransactionsByUserIdDAO;
    public List<LibraryTransaction> getTransactionsByUserId(Long userId){
        return getTransactionsByUserIdDAO.getTransactionsByUserId(userId);
    }
}

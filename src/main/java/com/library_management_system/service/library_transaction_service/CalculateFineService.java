package com.library_management_system.service.library_transaction_service;

import com.library_management_system.dao.library_transactions_dao.CalculateFineDAO;
import com.library_management_system.entity.LibraryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

@Service
public class CalculateFineService {
    @Autowired
    CalculateFineDAO calculateFineDAO;
    public Double calculateFine(Long transactionId){
        LibraryTransaction libraryTransaction = calculateFineDAO.calculateFine(transactionId);
        long diffInDays = ChronoUnit
                            .DAYS
                            .between(libraryTransaction.getCheckoutDate(),
                                    libraryTransaction.getReturnDate());
        return 1.52 * ((diffInDays-10)<=10 ? 0 : diffInDays-10);
    }
}

package com.library_management_system.dao.library_transactions_dao;

import com.library_management_system.entity.LibraryTransaction;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetTransactionByIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public LibraryTransaction getTransactionById(Long transactionId){
        return sessionFactory.openSession()
                .get(LibraryTransaction.class,transactionId);
    }
}

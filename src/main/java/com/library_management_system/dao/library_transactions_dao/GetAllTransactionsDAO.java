package com.library_management_system.dao.library_transactions_dao;

import com.library_management_system.entity.LibraryTransaction;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllTransactionsDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<LibraryTransaction> getAllTransactions(){
        return sessionFactory.openSession()
                .createCriteria(LibraryTransaction.class)
                .list();
    }
}

package com.library_management_system.dao.library_transactions_dao;

import com.library_management_system.entity.LibraryTransaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class ReturnBookDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean returnBook(Long transactionId){

        Session session = sessionFactory.openSession();
        LibraryTransaction libraryTransaction = session.get(LibraryTransaction.class,transactionId);
        if(libraryTransaction!=null){
            libraryTransaction.setReturnDate(LocalDate.now());
            Transaction transaction = session.beginTransaction();
            session.update(libraryTransaction);
            transaction.commit();
            return true;
        } else {
            return null;
        }

    }
}

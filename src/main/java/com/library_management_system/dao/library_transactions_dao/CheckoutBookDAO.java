package com.library_management_system.dao.library_transactions_dao;

import com.library_management_system.entity.LibraryTransaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class CheckoutBookDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean checkoutBook(Long userId, Long bookId){
        LibraryTransaction libraryTransaction = new LibraryTransaction();
        libraryTransaction.setUserID(userId);
        libraryTransaction.setBookID(bookId);
        libraryTransaction.setCheckoutDate(LocalDate.now());

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(libraryTransaction);
        transaction.commit();
        return true;
    }
}

package com.library_management_system.dao.book_dao;

import com.library_management_system.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteBookDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean deleteBook(Long bookID){
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class,bookID);
        if(book==null){
            return false;
        }
        Transaction tx = session.beginTransaction();
        session.delete(book);
        tx.commit();
        return true;
    }
}

package com.library_management_system.dao.book;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library_management_system.entity.Book;

@Repository
public class DeleteBookDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean deleteBook(Long bookID){
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class,bookID);
        if(book!=null){
            session.delete(book);
            return true;
        }
        return false;
    }
}

package com.library_management_system.dao.book;


import com.library_management_system.entity.Book;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddBookDAO {

    @Autowired
    SessionFactory sessionFactory;
    public Boolean addBook(Book book){
//        Book b = new Book(book.getBookName(),book.getBookAuthor(),book.getBookISBN(), book.getBookGenre(), new Date(),book.getBookAvailabilityStatus());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        b.setBookId(book.getBookId());
        session.save(book);
        transaction.commit();
        return true;
    }
}

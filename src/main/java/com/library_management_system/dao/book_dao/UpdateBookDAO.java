package com.library_management_system.dao.book_dao;

import com.library_management_system.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateBookDAO {
    @Autowired
    SessionFactory sessionFactory;
    public String updateBook(Book book){
        Book b = new Book();
        b.setBookId(book.getBookId());
        b.setBookAuthor(book.getBookAuthor());
        b.setBookISBN(book.getBookISBN());
        b.setBookAvailabilityStatus(book.getBookAvailabilityStatus());
        b.setBookName(book.getBookName());
        b.setBookPublicationYear(book.getBookPublicationYear());
        b.setBookGenre(book.getBookGenre());

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(b);
        tx.commit();
        return "Book Updated";
    }
}

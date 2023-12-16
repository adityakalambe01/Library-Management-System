package com.library_management_system.service.book;

import com.library_management_system.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class AddBookService {

//    @Autowired
//    SessionFactoryObj sessionFactoryObj;
    public Boolean addBook(Book book){
//        Session session = sessionFactoryObj.getSessionFactoryObject(Book.class).openSession();
        Session session = new Configuration().addAnnotatedClass(Book.class).buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        return true;
    }
}

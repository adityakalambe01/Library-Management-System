package com.library_management_system.dao.book_dao;

import com.library_management_system.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllBooksDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Book> getAllBooks(){
        return sessionFactory
                .openSession()
                .createCriteria(Book.class)
                .list();
    }
    
}

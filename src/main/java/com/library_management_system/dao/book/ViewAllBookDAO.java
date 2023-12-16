package com.library_management_system.dao.book;

import com.library_management_system.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ViewAllBookDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Book> viewAllBooks(){
        return (List<Book>) sessionFactory
                .openSession()
                .createCriteria(Book.class)
                .list();
    }
    
}

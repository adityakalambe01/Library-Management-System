package com.library_management_system.dao.book_dao;

import com.library_management_system.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetBookByIdDAO {

    @Autowired
    SessionFactory sessionFactory;
    public Book getBookById(Long id){
        return (Book) sessionFactory
                .openSession()
                .load(Book.class,id);
    }
}

package com.library_management_system.dao.book_dao;


import com.library_management_system.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookAvailabilityDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean getBookAvailability(Long bookID){
        return sessionFactory.openSession()
                .get(Book.class,bookID)
                .getBookAvailabilityStatus();
    }
}

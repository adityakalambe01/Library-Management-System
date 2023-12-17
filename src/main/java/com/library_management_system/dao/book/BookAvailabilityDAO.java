package com.library_management_system.dao.book;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library_management_system.entity.Book;

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

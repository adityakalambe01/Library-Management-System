package com.library_management_system.service.book_services;

import com.library_management_system.dao.book_dao.BookAvailabilityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAvailabilityService {
    @Autowired
    BookAvailabilityDAO bookAvailabilityDAO;
    public Boolean bookAvailability(Long bookID){
        return bookAvailabilityDAO.getBookAvailability(bookID);
    }
}

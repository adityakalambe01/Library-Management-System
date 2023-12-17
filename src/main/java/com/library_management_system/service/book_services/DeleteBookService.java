package com.library_management_system.service.book_services;

import com.library_management_system.dao.book_dao.DeleteBookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteBookService {
    @Autowired
    DeleteBookDAO deleteBookDAO;
    public Boolean deleteBook(Long bookId){
        return deleteBookDAO.deleteBook(bookId);
    }

}

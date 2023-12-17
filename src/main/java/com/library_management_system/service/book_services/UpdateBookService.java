package com.library_management_system.service.book_services;

import com.library_management_system.dao.book_dao.UpdateBookDAO;
import com.library_management_system.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateBookService {
    @Autowired
    UpdateBookDAO updateBookDAO;
    public String updateBook(Book book){
        return updateBookDAO.updateBook(book);
    }
}

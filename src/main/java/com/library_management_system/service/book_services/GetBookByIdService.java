package com.library_management_system.service.book_services;

import com.library_management_system.dao.book_dao.GetBookByIdDAO;
import com.library_management_system.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetBookByIdService {
    @Autowired
    GetBookByIdDAO getBookByIdDAO;
    public Book getBookByBookId(Long bookID){
        return getBookByIdDAO.getBookById(bookID);
    }
}

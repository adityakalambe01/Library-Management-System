package com.library_management_system.service.book_services;

import com.library_management_system.dao.book_dao.SearchBookByAuthorDAO;
import com.library_management_system.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchBookByAuthorService {
    @Autowired
    SearchBookByAuthorDAO searchBookByAuthorDAO;
    public List<Book> searchBookByAuthor(String bookAuthor){
        return searchBookByAuthorDAO.searchBookByAuthor(bookAuthor);
    }
}

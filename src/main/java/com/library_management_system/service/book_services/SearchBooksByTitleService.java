package com.library_management_system.service.book_services;

import com.library_management_system.dao.book_dao.SearchBooksByTitleDAO;
import com.library_management_system.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchBooksByTitleService {
    @Autowired
    SearchBooksByTitleDAO searchBooksByTitleDAO;
    public List<Book> searchBooksByTitle(String bookTitle){
        return searchBooksByTitleDAO.searchBookByTitle(bookTitle);
    }
}

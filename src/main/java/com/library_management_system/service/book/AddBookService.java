package com.library_management_system.service.book;


import com.library_management_system.dao.book.AddBookDAO;
import com.library_management_system.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddBookService {

    @Autowired
    AddBookDAO addBookDAO;
    public Boolean addBookToDB(Book book){
        return addBookDAO.addBook(book);
    }
}

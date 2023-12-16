package com.library_management_system.controller.book;

import com.library_management_system.dao.book.ViewAllBookDAO;
import com.library_management_system.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ViewAllBooks {
    @Autowired
    ViewAllBookDAO viewAllBookDAO;
    @RequestMapping(value = "/viewAllBooks",method = RequestMethod.GET)
    public List<Book> viewAllBooks(){
        return viewAllBookDAO.viewAllBooks();
    }
}

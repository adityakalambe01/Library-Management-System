package com.library_management_system.controller.book_controller;

import com.library_management_system.entity.Book;
import com.library_management_system.service.book_services.GetAllBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class GetAllBooksController {
    @Autowired
    GetAllBooksService getAllBooksService;
    @RequestMapping(value = "/getAllBooks",method = RequestMethod.GET)
    public List<Book> getAllBooks(){
        return getAllBooksService.getAllBooks();
    }
}

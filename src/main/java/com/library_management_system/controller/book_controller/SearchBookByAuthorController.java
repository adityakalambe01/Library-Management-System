package com.library_management_system.controller.book_controller;

import com.library_management_system.entity.Book;
import com.library_management_system.service.book_services.SearchBookByAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchBookByAuthorController {
    @Autowired
    SearchBookByAuthorService searchBookByAuthorService;
    @RequestMapping(value="/searchBookByAuthor/{bookAuthor}",method = RequestMethod.GET)
    public List<Book> searchBookByAuthor(@PathVariable String bookAuthor){
        return searchBookByAuthorService.searchBookByAuthor(bookAuthor);
    }
}

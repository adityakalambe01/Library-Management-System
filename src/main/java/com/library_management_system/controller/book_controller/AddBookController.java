package com.library_management_system.controller.book_controller;

import com.library_management_system.entity.Book;
import com.library_management_system.service.book_services.AddBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddBookController {
    @Autowired
    AddBookService addBookService;
    @RequestMapping(value = "/addBookToDB",method = RequestMethod.POST)
    public Boolean addBookToDB(@RequestBody Book book){
    	System.out.println(book);
        return addBookService.addBookToDB(book);
    }
}

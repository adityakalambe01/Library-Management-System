package com.library_management_system.controller.book_controller;

import com.library_management_system.entity.Book;
import com.library_management_system.service.book_services.UpdateBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateBookController {
    @Autowired
    UpdateBookService updateBookService;
    @RequestMapping(value = "/updateBook",method = RequestMethod.PUT)
    public String updateBook(Book book){
        return updateBookService.updateBook(book);
    }
}

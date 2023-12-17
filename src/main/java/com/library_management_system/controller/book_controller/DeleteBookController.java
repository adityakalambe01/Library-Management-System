package com.library_management_system.controller.book_controller;

import com.library_management_system.service.book_services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeleteBookController {
    @Autowired
    DeleteBookService deleteBookService;
    @RequestMapping(value = "/deleteBook/{bookId}",method = RequestMethod.DELETE)
    public Boolean deleteBook(@PathVariable Long bookId){
        return deleteBookService.deleteBook(bookId);
    }
    
}

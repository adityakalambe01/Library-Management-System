package com.library_management_system.controller.book_controller;

import com.library_management_system.entity.Book;
import com.library_management_system.service.book_services.GetBookByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetBookByBookIdController {
    @Autowired
    GetBookByIdService getBookByIdService;
    @RequestMapping(value = "/getBookById/{bookId}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable Long bookId){
        return getBookByIdService.getBookByBookId(bookId);
    }
}

package com.library_management_system.controller.book_controller;

import com.library_management_system.service.book_services.BookAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAvailabilityController {
    @Autowired
    BookAvailabilityService bookAvailabilityService;
    @RequestMapping(value = "/bookAvailability/{bookId}",method = RequestMethod.GET)
    public Boolean getBookAvailability(@PathVariable Long bookId){
        return bookAvailabilityService.bookAvailability(bookId);
    }
}

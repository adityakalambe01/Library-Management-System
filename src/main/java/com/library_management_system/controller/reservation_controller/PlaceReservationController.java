package com.library_management_system.controller.reservation_controller;

import com.library_management_system.service.reservation_service.PlaceReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceReservationController {
    @Autowired
    PlaceReservationService placeReservationService;
    @RequestMapping(value = "placeReservation/{userId}/{bookId}",method = RequestMethod.POST)
    public Long placeReservation(@PathVariable Long userId,@PathVariable Long bookId){
        return placeReservationService.placeReservation(userId, bookId);
    }
}

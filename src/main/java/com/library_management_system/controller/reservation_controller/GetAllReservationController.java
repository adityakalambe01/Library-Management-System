package com.library_management_system.controller.reservation_controller;

import com.library_management_system.entity.Reservation;
import com.library_management_system.service.reservation_service.GetAllReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllReservationController {
    @Autowired
    GetAllReservationService getAllReservationService;
    @RequestMapping(value = "/getAllReservations", method = RequestMethod.GET)
    public List<Reservation> getAllReservations(){
        return getAllReservationService.getAllReservations();
    }
}

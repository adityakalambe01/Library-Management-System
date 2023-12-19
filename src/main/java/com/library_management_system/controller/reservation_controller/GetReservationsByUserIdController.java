package com.library_management_system.controller.reservation_controller;

import com.library_management_system.entity.Reservation;
import com.library_management_system.service.reservation_service.GetReservationByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetReservationsByUserIdController {
    @Autowired
    GetReservationByIdService getReservationByIdService;
    public Reservation getReservationsByUserId(Long userId){
        return getReservationByIdService.getReservationById(userId);
    }
}

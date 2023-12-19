package com.library_management_system.controller.reservation_controller;

import com.library_management_system.service.reservation_service.CancelReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CancelReservationController {
    @Autowired
    CancelReservationService cancelReservationService;
    @RequestMapping(value = "cancelReservation/{reservationId}", method = RequestMethod.PUT)
    public String cancelReservation(@PathVariable Long reservationId){
        return cancelReservationService.cancelReservation(reservationId);
    }
}

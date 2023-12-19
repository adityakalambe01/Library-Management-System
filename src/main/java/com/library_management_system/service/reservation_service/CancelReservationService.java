package com.library_management_system.service.reservation_service;

import com.library_management_system.dao.reservation_dao.CancelReservationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancelReservationService {
    @Autowired
    CancelReservationDAO cancelReservationDAO;

    public String cancelReservation(Long reservationId){
        return (cancelReservationDAO.cancelReservation(reservationId)) ?
                "Reservation Cancelled" : "Invalid Reservation Id";
    }
}

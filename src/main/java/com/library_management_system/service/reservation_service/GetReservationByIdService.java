package com.library_management_system.service.reservation_service;

import com.library_management_system.dao.reservation_dao.GetReservationByIdDAO;
import com.library_management_system.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetReservationByIdService {
    @Autowired
    GetReservationByIdDAO getReservationByIdDAO;
    public Reservation getReservationById(Long reservationId){
        return getReservationByIdDAO.getReservationById(reservationId);
    }
}

package com.library_management_system.service.reservation_service;


import com.library_management_system.dao.reservation_dao.GetAllReservationDAO;
import com.library_management_system.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllReservationService {
    @Autowired
    GetAllReservationDAO getAllReservationDAO;
    public List<Reservation> getAllReservations(){
        return getAllReservationDAO.getAllReservations();
    }
}

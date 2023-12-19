package com.library_management_system.service.reservation_service;

import com.library_management_system.dao.reservation_dao.PlaceReservationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceReservationService {
    @Autowired
    PlaceReservationDAO placeReservationDAO;
    public Long placeReservation(Long userId, Long bookId){
        return placeReservationDAO.placeReservation(userId,bookId);
    }
}

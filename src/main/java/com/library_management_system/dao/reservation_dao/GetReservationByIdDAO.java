package com.library_management_system.dao.reservation_dao;

import com.library_management_system.entity.Reservation;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetReservationByIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Reservation getReservationById(Long reservationId){
        return sessionFactory.openSession()
                .load(Reservation.class,reservationId);
    }
}

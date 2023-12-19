package com.library_management_system.dao.reservation_dao;

import com.library_management_system.entity.Reservation;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllReservationDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Reservation> getAllReservations(){
        return sessionFactory.openSession()
                .createCriteria(Reservation.class)
                .list();
    }
}

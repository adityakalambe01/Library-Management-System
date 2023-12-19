package com.library_management_system.dao.reservation_dao;

import com.library_management_system.entity.Reservation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CancelReservationDAO {
    @Autowired
    SessionFactory sessionFactory;

    public boolean cancelReservation(Long reservationId){
        Session session = sessionFactory.openSession();
        Reservation reservation = session.get(Reservation.class,reservationId);
        if(reservation==null){
            return false;
        }
        reservation.setReservationStatus("Reservation Cancelled!");
        Transaction transaction = session.beginTransaction();
        session.update(reservation);
        transaction.commit();
        return true;
    }
}

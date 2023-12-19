package com.library_management_system.dao.reservation_dao;

import com.library_management_system.entity.Reservation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class PlaceReservationDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Long placeReservation(Long userId, Long bookId){
        Reservation reservation = new Reservation();
        reservation.setUserId(userId);
        reservation.setBookId(bookId);
        reservation.setReservationDate(LocalDate.now());
        reservation.setReservationStatus("Reservation Confirmed");

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(reservation);
        transaction.commit();

//        return (Reservation) sessionFactory.openSession()
//                .createCriteria(Reservation.class)
//                .add(Restrictions.like("userId",userId))
//                .addOrder(Order.desc("reservationId"))
//                .setFetchSize(1)
//                .uniqueResult();
        return reservation.getReservationId();
    }
}

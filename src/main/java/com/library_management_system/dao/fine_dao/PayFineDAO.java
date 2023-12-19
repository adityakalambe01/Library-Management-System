package com.library_management_system.dao.fine_dao;

import com.library_management_system.entity.Fine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayFineDAO {
    @Autowired
    SessionFactory sessionFactory;
    public String payFine(Long fineId){
        Session session = sessionFactory.openSession();
        Fine fine = session.load(Fine.class,fineId);
        if(fine==null) return "Invalid fine Id";
        fine.setPaymentStatus("Paid");
        return fine.getPaymentStatus();
    }
}

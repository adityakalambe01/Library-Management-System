package com.library_management_system.dao.fine_dao;

import com.library_management_system.entity.Fine;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayFineDAO {
    @Autowired
    SessionFactory sessionFactory;
    public String payFine(Long fineId){
        return (sessionFactory.openSession()
                .get(Fine.class,fineId)
                .getFineAmount()==0) ? "Paid" : "Remaining";
    }
}

package com.library_management_system.dao.fine_dao;

import com.library_management_system.entity.Fine;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetFineByIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Fine getFineById(Long fineId){
        return sessionFactory.openSession()
                .get(Fine.class,fineId);
    }
}

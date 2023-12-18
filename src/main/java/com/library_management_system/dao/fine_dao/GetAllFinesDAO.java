package com.library_management_system.dao.fine_dao;

import com.library_management_system.entity.Fine;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllFinesDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Fine> getAllFines(){
        return sessionFactory.openSession()
                .createCriteria(Fine.class)
                .list();
    }
}

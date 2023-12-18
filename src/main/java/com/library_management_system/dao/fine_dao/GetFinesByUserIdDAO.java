package com.library_management_system.dao.fine_dao;

import com.library_management_system.entity.Fine;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetFinesByUserIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Fine> getFinesByUserId(Long userId){
        return sessionFactory.openSession()
                .createCriteria(Fine.class)
                .add(Restrictions.like("userId",userId))
                .list();
    }
}

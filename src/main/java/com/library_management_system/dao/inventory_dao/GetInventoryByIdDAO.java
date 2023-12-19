package com.library_management_system.dao.inventory_dao;

import com.library_management_system.entity.Inventory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetInventoryByIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Inventory getInventoryById(Long bookId){
        return sessionFactory.openSession()
                .load(Inventory.class,bookId);
    }
}

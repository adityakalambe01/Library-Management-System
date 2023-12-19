package com.library_management_system.dao.inventory_dao;

import com.library_management_system.entity.Inventory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllInventoryDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Inventory> getAllInventoryEntries(){
        return sessionFactory.openSession()
                .createCriteria(Inventory.class)
                .list();
    }
}

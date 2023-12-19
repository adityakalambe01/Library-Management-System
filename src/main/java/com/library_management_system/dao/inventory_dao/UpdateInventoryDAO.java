package com.library_management_system.dao.inventory_dao;

import com.library_management_system.entity.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateInventoryDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean updateInventory(Inventory inventory){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(inventory);
        transaction.commit();
        return true;
    }
}

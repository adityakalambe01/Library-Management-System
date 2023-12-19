package com.library_management_system.dao.inventory_dao;

import com.library_management_system.entity.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddInventoryEntryDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Boolean addInventoryEntry(Inventory inventory){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(inventory);
        transaction.commit();
        return true;
    }
}

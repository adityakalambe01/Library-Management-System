package com.library_management_system.dao.inventory_dao;

import com.library_management_system.entity.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteInventoryEntryDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean deleteInventoryEntry(Long bookId){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Inventory inventory = session.load(Inventory.class,bookId);
        if(inventory==null) return false;
        session.delete(inventory);
        transaction.commit();
        return true;
    }
}

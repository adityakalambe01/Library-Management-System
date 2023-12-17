package com.library_management_system.dao.library_staff_dao;

import com.library_management_system.entity.LibraryStaff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddLibraryStaffDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean addLibraryStaff(LibraryStaff libraryStaff){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(libraryStaff);
        tx.commit();
        return true;
    }
}

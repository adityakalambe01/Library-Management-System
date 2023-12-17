package com.library_management_system.dao.library_staff_dao;

import com.library_management_system.entity.LibraryStaff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateLibraryStaffDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean updateLibraryStaff(LibraryStaff libraryStaff){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(libraryStaff);
        transaction.commit();
        return true;
    }
}

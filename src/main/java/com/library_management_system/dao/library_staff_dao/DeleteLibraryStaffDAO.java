package com.library_management_system.dao.library_staff_dao;

import com.library_management_system.entity.LibraryStaff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteLibraryStaffDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean deleteLibraryStaff(Long staffID){
        Session session = sessionFactory.openSession();
        LibraryStaff libraryStaff = session.get(LibraryStaff.class,staffID);
        Transaction transaction = session.beginTransaction();
        session.delete(libraryStaff);
        transaction.commit();
        return true;
    }
}

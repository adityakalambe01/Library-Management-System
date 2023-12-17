package com.library_management_system.dao.library_staff_dao;

import com.library_management_system.entity.LibraryStaff;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetLibraryStaffByIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public LibraryStaff getLibraryStaffById(Long staffID){
        return sessionFactory.openSession()
                .get(LibraryStaff.class,staffID);
    }
}

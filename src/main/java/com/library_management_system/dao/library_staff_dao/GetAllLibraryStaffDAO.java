package com.library_management_system.dao.library_staff_dao;

import com.library_management_system.entity.LibraryStaff;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllLibraryStaffDAO {
    @Autowired
    SessionFactory sessionFactory;
    @SuppressWarnings({ "deprecation", "unchecked" })
	public List<LibraryStaff> getAllLibraryStaff(){
        return sessionFactory.openSession()
                .createCriteria(LibraryStaff.class)
                .list();
    }
}

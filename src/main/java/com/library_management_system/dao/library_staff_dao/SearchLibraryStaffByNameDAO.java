package com.library_management_system.dao.library_staff_dao;

import com.library_management_system.entity.LibraryStaff;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SearchLibraryStaffByNameDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<LibraryStaff> searchLibraryStaffByName(String staffName){
        return sessionFactory.openSession()
                .createCriteria(LibraryStaff.class)
                .add(Restrictions.like("staffMemberName",staffName))
                .list();
    }
}

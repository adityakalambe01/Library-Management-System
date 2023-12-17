package com.library_management_system.dao.library_branch_dao;

import com.library_management_system.entity.LibraryBranch;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllLibraryBranchesDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<LibraryBranch> getAllLibraryBranches(){
        return sessionFactory.openSession()
                .createCriteria(LibraryBranch.class)
                .list();
    }
}

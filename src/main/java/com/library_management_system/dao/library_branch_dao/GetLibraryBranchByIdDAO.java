package com.library_management_system.dao.library_branch_dao;

import com.library_management_system.entity.LibraryBranch;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetLibraryBranchByIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public LibraryBranch getLibraryBranchById(Long branchID){
        return sessionFactory.openSession()
                .get(LibraryBranch.class,branchID);
    }
}

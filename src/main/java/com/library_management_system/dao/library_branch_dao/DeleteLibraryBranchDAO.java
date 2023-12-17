package com.library_management_system.dao.library_branch_dao;

import com.library_management_system.entity.LibraryBranch;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteLibraryBranchDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean deleteLibraryBranch(Long branchID){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        LibraryBranch libraryBranch = session.load(LibraryBranch.class,branchID);
        session.delete(libraryBranch);
        transaction.commit();
        return true;
    }
}

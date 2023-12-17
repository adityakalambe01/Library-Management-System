package com.library_management_system.dao.library_branch_dao;

import com.library_management_system.entity.LibraryBranch;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddLibraryBranchDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean addLibraryBranch(LibraryBranch libraryBranch){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(libraryBranch);
        transaction.commit();
        return true;
    }
}

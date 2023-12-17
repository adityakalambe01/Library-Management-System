package com.library_management_system.dao.member_dao;

import com.library_management_system.entity.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddMemberDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean addMember(Member member){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(member);
        transaction.commit();
        return true;
    }
}

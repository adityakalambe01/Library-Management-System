package com.library_management_system.dao.member_dao;

import com.library_management_system.entity.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteMemberDAO {
    @Autowired
    SessionFactory sessionFactory;
    public boolean deleteMember(Long memberID){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(session.get(Member.class,memberID));
        tx.commit();
        return true;
    }
}

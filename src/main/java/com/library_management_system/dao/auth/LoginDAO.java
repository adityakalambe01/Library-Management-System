package com.library_management_system.dao.auth;

import com.library_management_system.entity.Member;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Member memberLogin(Member member){
        return sessionFactory.openSession()
                .get(Member.class,member.getMemberID());
    }
}

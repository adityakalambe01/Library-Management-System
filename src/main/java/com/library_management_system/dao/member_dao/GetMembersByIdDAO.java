package com.library_management_system.dao.member_dao;

import com.library_management_system.entity.Member;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetMembersByIdDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Member getMembersById(Long userID){
        return sessionFactory.openSession()
                .get(Member.class,userID);
    }
}

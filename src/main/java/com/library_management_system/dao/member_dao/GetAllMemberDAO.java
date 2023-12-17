package com.library_management_system.dao.member_dao;

import com.library_management_system.entity.Member;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllMemberDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Member> gelAllMembers(){
        return sessionFactory.openSession()
                .createCriteria(Member.class)
                .list();
    }
}

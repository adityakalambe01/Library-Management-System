package com.library_management_system.dao.member_dao;

import com.library_management_system.entity.Member;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SearchMembersByNameDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Member> searchMembersByName(String memberName){
        return sessionFactory.openSession()
                .createCriteria(Member.class)
                .add(Restrictions.like("memberName",memberName))
                .list();
    }
}

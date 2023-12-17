package com.library_management_system.dao.member_dao;

import com.library_management_system.entity.Member;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SearchMembersByNameDAO {
    @Autowired
    SessionFactory sessionFactory;
    public Member searchMembersByName(String memberName){
        return (Member) sessionFactory.openSession()
                .createCriteria(Member.class)
                .add(Restrictions.like("memberName",memberName))
                .uniqueResult();
    }
}

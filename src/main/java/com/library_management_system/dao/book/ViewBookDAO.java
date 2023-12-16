package com.library_management_system.dao.book;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ViewBookDAO {

    @Autowired
    SessionFactory sessionFactory;
    public Boolean viewBook(){return false;};
}

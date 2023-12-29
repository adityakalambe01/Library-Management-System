package com.library_management_system.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetTableController {
    @Autowired
    SessionFactory sessionFactory;
    @RequestMapping("getTables")
    public List getTables(){
        Session session = sessionFactory.openSession();
        List<Object[]> list = session.createSQLQuery("select * from project.systables").list();
        return list;
    }
}

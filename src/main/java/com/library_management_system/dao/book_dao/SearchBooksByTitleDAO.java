package com.library_management_system.dao.book_dao;

import com.library_management_system.entity.Book;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SearchBooksByTitleDAO {
    @Autowired
    SessionFactory sessionFactory;
    public List<Book> searchBookByTitle(String title){
        return sessionFactory.openSession()
                .createCriteria(Book.class)
                .add(Restrictions.like("bookName",title))
                .list();
    }
}

package com.library_management_system.service.auth;

import com.library_management_system.dao.auth.LoginDAO;
import com.library_management_system.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginDAO loginDAO;
    public Boolean memberLogin(Member browserMember){
        Member databaseMember = loginDAO.memberLogin(browserMember);
        return (databaseMember==null) ? null : databaseMember.getPassword().equals(browserMember.getPassword());
    }
}

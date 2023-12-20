package com.library_management_system.service.auth;

import com.library_management_system.dao.auth.HashPassword;
import com.library_management_system.dao.auth.LoginDAO;
import com.library_management_system.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class LoginService {
    @Autowired
    LoginDAO loginDAO;
    @Autowired
    HashPassword hashPassword;
    public Boolean memberLogin(Member browserMember) throws NoSuchAlgorithmException {
        Member databaseMember = loginDAO.memberLogin(browserMember);
        return (databaseMember==null) ? null : databaseMember.getPassword()
                                                .equals(
                                                        hashPassword.getHashPassword(browserMember.getPassword())
                                                );
    }
}

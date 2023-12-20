package com.library_management_system.service.member_services;

import com.library_management_system.dao.auth.HashPassword;
import com.library_management_system.dao.member_dao.AddMemberDAO;
import com.library_management_system.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class AddMemberService {
    @Autowired
    AddMemberDAO addMemberDAO;
    @Autowired
    HashPassword hashPassword;
    public Boolean addMember(Member member) throws NoSuchAlgorithmException {

        member.setPassword(
                hashPassword.getHashPassword(member.getPassword())
        );
        return addMemberDAO.addMember(member);
    }
}

package com.library_management_system.service.member_services;

import com.library_management_system.dao.member_dao.AddMemberDAO;
import com.library_management_system.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddMemberService {
    @Autowired
    AddMemberDAO addMemberDAO;
    public Boolean addMember(Member member){
        return addMemberDAO.addMember(member);
    }
}

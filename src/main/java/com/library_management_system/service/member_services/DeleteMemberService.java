package com.library_management_system.service.member_services;

import com.library_management_system.dao.member_dao.DeleteMemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteMemberService {
    @Autowired
    DeleteMemberDAO deleteMemberDAO;
    public boolean deleteMember(Long memberID){
        return deleteMemberDAO.deleteMember(memberID);
    }
}

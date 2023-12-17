package com.library_management_system.service.member_services;

import com.library_management_system.dao.member_dao.UpdateMemberDAO;
import com.library_management_system.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateMemberService {
    @Autowired
    UpdateMemberDAO updateMemberDAO;
    public boolean updateMember(Member member){
        return updateMemberDAO.updateMember(member);
    }
}

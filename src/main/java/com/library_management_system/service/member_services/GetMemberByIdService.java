package com.library_management_system.service.member_services;

import com.library_management_system.dao.member_dao.GetMembersByIdDAO;
import com.library_management_system.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetMemberByIdService {
    @Autowired
    GetMembersByIdDAO getMembersByIdDAO;
    public Member getMemberById(Long memberID){
        return getMembersByIdDAO.getMembersById(memberID);
    }
}

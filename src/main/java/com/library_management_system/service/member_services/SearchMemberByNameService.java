package com.library_management_system.service.member_services;

import com.library_management_system.dao.member_dao.SearchMembersByNameDAO;
import com.library_management_system.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchMemberByNameService {
    @Autowired
    SearchMembersByNameDAO searchMembersByNameDAO;
    public List<Member> searchMemberByName(String memberName){
        return searchMembersByNameDAO.searchMembersByName(memberName);
    }
}

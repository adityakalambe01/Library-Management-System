package com.library_management_system.controller.member_controller;

import com.library_management_system.entity.Member;
import com.library_management_system.service.member_services.SearchMemberByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchMemberByNameController {
    @Autowired
    SearchMemberByNameService searchMemberByNameService;
    @RequestMapping(value = "/searchMemberByName/{memberName}",method = RequestMethod.GET)
    public List<Member> searchMemberByName(@PathVariable String memberName){
        return searchMemberByNameService.searchMemberByName(memberName);
    }
}

package com.library_management_system.controller.member_controller;

import com.library_management_system.entity.Member;
import com.library_management_system.service.member_services.GetAllMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllMembersController {
    @Autowired
    GetAllMemberService getAllMemberService;
    @RequestMapping(value = "/gelAllMember",method = RequestMethod.GET)
    public List<Member> gelAllMember(){
        return getAllMemberService.getAllMember();
    }
}

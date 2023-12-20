package com.library_management_system.controller.member_controller;

import com.library_management_system.entity.Member;
import com.library_management_system.service.member_services.AddMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
public class AddMemberController {
    @Autowired
    AddMemberService addMemberService;
    @RequestMapping(value = "addMember",method = RequestMethod.POST)
    public Boolean addMember(@RequestBody Member member) throws NoSuchAlgorithmException {
        return addMemberService.addMember(member);

    }
}

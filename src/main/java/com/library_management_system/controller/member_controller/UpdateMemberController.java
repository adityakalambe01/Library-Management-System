package com.library_management_system.controller.member_controller;

import com.library_management_system.entity.Member;
import com.library_management_system.service.member_services.UpdateMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateMemberController {
    @Autowired
    UpdateMemberService updateMemberService;
    @RequestMapping(value = "/updateMember", method = RequestMethod.PUT)
    public boolean updateMember(@RequestBody Member member){
        return updateMemberService.updateMember(member);
    }
}

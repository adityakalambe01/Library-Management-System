package com.library_management_system.controller.member_controller;

import com.library_management_system.service.member_services.DeleteMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteMemberController {
    @Autowired
    DeleteMemberService deleteMemberService;
    @RequestMapping(value = "deleteMember/{memberID}",method = RequestMethod.DELETE)
    public boolean deleteMember(@PathVariable Long memberID){
        return deleteMemberService.deleteMember(memberID);
    }
}

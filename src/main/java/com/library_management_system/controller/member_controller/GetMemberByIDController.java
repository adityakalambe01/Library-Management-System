package com.library_management_system.controller.member_controller;

import com.library_management_system.entity.Member;
import com.library_management_system.service.member_services.GetMemberByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMemberByIDController {
    @Autowired
    GetMemberByIdService getMemberByIdService;
    @RequestMapping(value = "/getMemberById/{memberID}",method = RequestMethod.GET)
    public Member getMemberById(@PathVariable Long memberID){
        return getMemberByIdService.getMemberById(memberID);
    }
}

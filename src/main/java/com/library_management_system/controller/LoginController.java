package com.library_management_system.controller;

import com.library_management_system.entity.Member;
import com.library_management_system.service.auth.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "/memberLogin", method = RequestMethod.POST)
    public Boolean memberLogin(@RequestBody Member browserMember) throws NoSuchAlgorithmException {
        return loginService.memberLogin(browserMember);
    }
}

package com.library_management_system.controller.library_staff_controller;

import com.library_management_system.entity.LibraryStaff;
import com.library_management_system.service.library_staff_services.GetAllLibraryStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllLibraryStaffController {
    @Autowired
    GetAllLibraryStaffService getAllLibraryStaffService;
    @RequestMapping(value = "/getAllStaff",method = RequestMethod.GET)
    public List<LibraryStaff> getAllLibraryStaff(){
        return getAllLibraryStaffService.getAllLibraryStaff();
    }
}

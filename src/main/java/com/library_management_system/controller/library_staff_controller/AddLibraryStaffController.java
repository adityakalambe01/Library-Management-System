package com.library_management_system.controller.library_staff_controller;

import com.library_management_system.entity.LibraryStaff;
import com.library_management_system.service.library_staff_services.AddLibraryStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddLibraryStaffController {
    @Autowired
    AddLibraryStaffService addLibraryStaffService;

    @RequestMapping(value = "/addLibraryStaff", method = RequestMethod.POST)
    public boolean addLibraryStaff(@RequestBody LibraryStaff libraryStaff){
        return addLibraryStaffService.addLibraryStaff(libraryStaff);
    }
}

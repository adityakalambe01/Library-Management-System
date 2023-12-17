package com.library_management_system.controller.library_staff_controller;

import com.library_management_system.entity.LibraryStaff;
import com.library_management_system.service.library_staff_services.UpdateLibraryStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateLibraryStaffController {
    @Autowired
    UpdateLibraryStaffService updateLibraryStaffService;
    @RequestMapping(value = "/updateLibraryStaff", method = RequestMethod.POST)
    public boolean updateLibraryStaff(@RequestBody LibraryStaff libraryStaff){
        return updateLibraryStaffService.updateLibraryStaff(libraryStaff);
    }
}

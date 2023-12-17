package com.library_management_system.controller.library_staff_controller;

import com.library_management_system.service.library_staff_services.DeleteLibraryStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteLibraryStaffController {
    @Autowired
    DeleteLibraryStaffService deleteLibraryStaffService;
    @RequestMapping(value = "/deleteLibraryStaff/{staffID}", method = RequestMethod.DELETE)
    public boolean deleteLibraryStaff(@PathVariable Long staffID){
        return deleteLibraryStaffService.deleteLibraryStaff(staffID);
    }
}

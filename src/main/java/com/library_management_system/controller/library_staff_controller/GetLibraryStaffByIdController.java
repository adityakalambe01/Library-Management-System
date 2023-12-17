package com.library_management_system.controller.library_staff_controller;

import com.library_management_system.entity.LibraryStaff;
import com.library_management_system.service.library_staff_services.GetLibraryStaffByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetLibraryStaffByIdController {
    @Autowired
    GetLibraryStaffByIdService getLibraryStaffByIdService;
    @RequestMapping(value = "getLibraryStaffById/{staffID}", method = RequestMethod.GET)
    public LibraryStaff getLibraryStaffById(@PathVariable Long staffID){
        return getLibraryStaffByIdService.getLibraryStaffById(staffID);
    }
}

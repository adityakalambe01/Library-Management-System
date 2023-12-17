package com.library_management_system.controller.library_staff_controller;

import com.library_management_system.entity.LibraryStaff;
import com.library_management_system.service.library_staff_services.SearchLibraryStaffByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchLibraryStaffByNameController {
    @Autowired
    SearchLibraryStaffByNameService searchLibraryStaffByNameService;
    @RequestMapping(value = "searchLibraryStaffByName/{staffName}",method = RequestMethod.GET)
    public List<LibraryStaff> searchLibraryStaffByName(@PathVariable String staffName){
        return searchLibraryStaffByNameService.searchLibraryStaffByName(staffName);
    }
}

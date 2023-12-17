package com.library_management_system.controller.library_branch_controller;

import com.library_management_system.entity.LibraryBranch;
import com.library_management_system.service.library_branch_services.AddLibraryBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddLibraryBranchController {
    @Autowired
    AddLibraryBranchService addLibraryBranchService;
    @RequestMapping(value = "/addLibraryBranch",method = RequestMethod.POST)
    public boolean addLibraryBranch(@RequestBody LibraryBranch libraryBranch){
        return addLibraryBranchService.addLibraryBranch(libraryBranch);
    }
}

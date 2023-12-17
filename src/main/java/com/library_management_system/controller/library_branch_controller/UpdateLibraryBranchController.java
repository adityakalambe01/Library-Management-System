package com.library_management_system.controller.library_branch_controller;

import com.library_management_system.entity.LibraryBranch;
import com.library_management_system.service.library_branch_services.UpdateLibraryBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateLibraryBranchController {
    @Autowired
    UpdateLibraryBranchService updateLibraryBranchService;
    @RequestMapping(value = "/updateLibraryBranch", method = RequestMethod.PUT)
    public boolean updateLibraryBranch(@RequestBody LibraryBranch libraryBranch){
        return updateLibraryBranchService.updateLibraryBranch(libraryBranch);
    }
}

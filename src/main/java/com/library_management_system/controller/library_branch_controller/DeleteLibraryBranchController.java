package com.library_management_system.controller.library_branch_controller;

import com.library_management_system.service.library_branch_services.DeleteLibraryBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteLibraryBranchController {
    @Autowired
    DeleteLibraryBranchService deleteLibraryBranchService;
    @RequestMapping(value = "/deleteLibraryBranch/{branchID}", method = RequestMethod.DELETE)
    public boolean deleteLibraryBranch(@PathVariable Long branchID){
        return deleteLibraryBranchService.deleteLibraryBranch(branchID);
    }
}

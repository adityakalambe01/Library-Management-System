package com.library_management_system.controller.library_branch_controller;

import com.library_management_system.entity.LibraryBranch;
import com.library_management_system.service.library_branch_services.GetLibraryBranchByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetLibraryBranchByIdController {
    @Autowired
    GetLibraryBranchByIdService getLibraryBranchByIdService;
    @RequestMapping(value = "getLibraryBranchById/{branchID}", method = RequestMethod.GET)
    public LibraryBranch getLibraryBranchById(@PathVariable Long branchID){
        return getLibraryBranchByIdService.getLibraryBranchById(branchID);
    }
}

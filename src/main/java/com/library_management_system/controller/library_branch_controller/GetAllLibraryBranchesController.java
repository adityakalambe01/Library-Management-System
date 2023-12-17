package com.library_management_system.controller.library_branch_controller;

import com.library_management_system.entity.LibraryBranch;
import com.library_management_system.service.library_branch_services.GetAllLibraryBranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllLibraryBranchesController {
    @Autowired
    GetAllLibraryBranchesService getAllLibraryBranchesService;
    @RequestMapping(value = "/getAllLibraryBranches",method = RequestMethod.GET)
    public List<LibraryBranch> getAllLibraryBranches(){
        return getAllLibraryBranchesService.getAllLibraryBranches();
    }
}

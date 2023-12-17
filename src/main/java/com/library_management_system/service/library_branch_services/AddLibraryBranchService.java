package com.library_management_system.service.library_branch_services;

import com.library_management_system.dao.library_branch_dao.AddLibraryBranchDAO;
import com.library_management_system.entity.LibraryBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddLibraryBranchService {
    @Autowired
    AddLibraryBranchDAO addLibraryBranchDAO;
    public boolean addLibraryBranch(LibraryBranch libraryBranch){
        return addLibraryBranchDAO.addLibraryBranch(libraryBranch);
    }
}

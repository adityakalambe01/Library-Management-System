package com.library_management_system.service.library_branch_services;

import com.library_management_system.dao.library_branch_dao.UpdateLibraryBranchDAO;
import com.library_management_system.entity.LibraryBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateLibraryBranchService {
    @Autowired
    UpdateLibraryBranchDAO updateLibraryBranchDAO;
    public boolean updateLibraryBranch(LibraryBranch libraryBranch){
        return updateLibraryBranchDAO.updateLibraryBranch(libraryBranch);
    }
}

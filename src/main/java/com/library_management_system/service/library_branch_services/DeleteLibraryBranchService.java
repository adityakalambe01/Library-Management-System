package com.library_management_system.service.library_branch_services;

import com.library_management_system.dao.library_branch_dao.DeleteLibraryBranchDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteLibraryBranchService {
    @Autowired
    DeleteLibraryBranchDAO deleteLibraryBranchDAO;
    public boolean deleteLibraryBranch(Long branchID){
        return deleteLibraryBranchDAO.deleteLibraryBranch(branchID);
    }
}

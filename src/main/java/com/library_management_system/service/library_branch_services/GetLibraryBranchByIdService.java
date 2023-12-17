package com.library_management_system.service.library_branch_services;

import com.library_management_system.dao.library_branch_dao.GetLibraryBranchByIdDAO;
import com.library_management_system.entity.LibraryBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetLibraryBranchByIdService {
    @Autowired
    GetLibraryBranchByIdDAO getLibraryBranchByIdDAO;
    public LibraryBranch getLibraryBranchById(Long branchID){
        return getLibraryBranchByIdDAO.getLibraryBranchById(branchID);
    }
}

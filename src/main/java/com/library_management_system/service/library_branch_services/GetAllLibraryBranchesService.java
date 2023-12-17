package com.library_management_system.service.library_branch_services;

import com.library_management_system.dao.library_branch_dao.GetAllLibraryBranchesDAO;
import com.library_management_system.entity.LibraryBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllLibraryBranchesService {
    @Autowired
    GetAllLibraryBranchesDAO getAllLibraryBranchesDAO;
    public List<LibraryBranch> getAllLibraryBranches(){
        return getAllLibraryBranchesDAO.getAllLibraryBranches();
    }
}

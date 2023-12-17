package com.library_management_system.service.library_staff_services;

import com.library_management_system.dao.library_staff_dao.SearchLibraryStaffByNameDAO;
import com.library_management_system.entity.LibraryStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchLibraryStaffByNameService {
    @Autowired
    SearchLibraryStaffByNameDAO searchLibraryStaffByNameDAO;
    public List<LibraryStaff> searchLibraryStaffByName(String staffName){
        return searchLibraryStaffByNameDAO.searchLibraryStaffByName(staffName);
    }
}

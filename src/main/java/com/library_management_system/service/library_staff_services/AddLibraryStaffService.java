package com.library_management_system.service.library_staff_services;

import com.library_management_system.dao.library_staff_dao.AddLibraryStaffDAO;
import com.library_management_system.entity.LibraryStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddLibraryStaffService {
    @Autowired
    AddLibraryStaffDAO addLibraryStaffDAO;
    public boolean addLibraryStaff(LibraryStaff libraryStaff){
        return addLibraryStaffDAO.addLibraryStaff(libraryStaff);
    }
}

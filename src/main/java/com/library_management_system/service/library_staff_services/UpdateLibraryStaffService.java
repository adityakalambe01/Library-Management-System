package com.library_management_system.service.library_staff_services;

import com.library_management_system.dao.library_staff_dao.UpdateLibraryStaffDAO;
import com.library_management_system.entity.LibraryStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateLibraryStaffService {
    @Autowired
    UpdateLibraryStaffDAO updateLibraryStaffDAO;
    public boolean updateLibraryStaff(LibraryStaff libraryStaff){
        return updateLibraryStaffDAO.updateLibraryStaff(libraryStaff);
    }
}

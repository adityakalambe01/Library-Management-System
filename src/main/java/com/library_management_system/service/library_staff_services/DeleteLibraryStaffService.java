package com.library_management_system.service.library_staff_services;

import com.library_management_system.dao.library_staff_dao.DeleteLibraryStaffDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteLibraryStaffService {
    @Autowired
    DeleteLibraryStaffDAO deleteLibraryStaffDAO;
    public boolean deleteLibraryStaff(Long staffID){
        return deleteLibraryStaffDAO.deleteLibraryStaff(staffID);
    }
}

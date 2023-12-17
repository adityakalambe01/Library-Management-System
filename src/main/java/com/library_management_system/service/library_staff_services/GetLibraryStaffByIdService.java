package com.library_management_system.service.library_staff_services;

import com.library_management_system.dao.library_staff_dao.GetLibraryStaffByIdDAO;
import com.library_management_system.entity.LibraryStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetLibraryStaffByIdService {
    @Autowired
    GetLibraryStaffByIdDAO getLibraryStaffByIdDAO;
    public LibraryStaff getLibraryStaffById(Long staffID){
        return getLibraryStaffByIdDAO.getLibraryStaffById(staffID);
    }
}

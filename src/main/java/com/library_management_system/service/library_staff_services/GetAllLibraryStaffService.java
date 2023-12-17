package com.library_management_system.service.library_staff_services;

import com.library_management_system.dao.library_staff_dao.GetAllLibraryStaffDAO;
import com.library_management_system.entity.LibraryStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllLibraryStaffService {
    @Autowired
    GetAllLibraryStaffDAO getAllLibraryStaffDAO;
    public List<LibraryStaff> getAllLibraryStaff(){
        return getAllLibraryStaffDAO.getAllLibraryStaff();
    }
}

package com.library_management_system.service.fine_services;

import com.library_management_system.dao.fine_dao.GetAllFinesDAO;
import com.library_management_system.entity.Fine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllFinesService {
    @Autowired
    GetAllFinesDAO getAllFinesDAO;
    public List<Fine> getAllFines(){
        return getAllFinesDAO.getAllFines();
    }
}

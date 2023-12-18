package com.library_management_system.service.fine_services;

import com.library_management_system.dao.fine_dao.GetFinesByUserIdDAO;
import com.library_management_system.entity.Fine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetFinesByUserIdService {
    @Autowired
    GetFinesByUserIdDAO getFinesByUserIdDAO;
    public List<Fine> getFinesByUserId(Long userId){
        return getFinesByUserIdDAO.getFinesByUserId(userId);
    }
}

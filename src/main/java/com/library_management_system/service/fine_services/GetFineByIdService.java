package com.library_management_system.service.fine_services;

import com.library_management_system.dao.fine_dao.GetFineByIdDAO;
import com.library_management_system.entity.Fine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetFineByIdService {
    @Autowired
    GetFineByIdDAO getFineByIdDAO;
    public Fine getFineById(Long fineId){
        return getFineByIdDAO.getFineById(fineId);
    }
}

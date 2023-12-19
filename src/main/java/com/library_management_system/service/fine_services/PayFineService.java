package com.library_management_system.service.fine_services;

import com.library_management_system.dao.fine_dao.PayFineDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayFineService {
    @Autowired
    PayFineDAO payFineDAO;
    public String payFine(Long fineId){
        return payFineDAO.payFine(fineId);
    }
}

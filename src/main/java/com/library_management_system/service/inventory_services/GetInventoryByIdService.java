package com.library_management_system.service.inventory_services;

import com.library_management_system.dao.inventory_dao.GetInventoryByIdDAO;
import com.library_management_system.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetInventoryByIdService {
    @Autowired
    GetInventoryByIdDAO getInventoryByIdDAO;
    public Inventory getInventoryById(Long bookId){
        return getInventoryByIdDAO.getInventoryById(bookId);
    }
}

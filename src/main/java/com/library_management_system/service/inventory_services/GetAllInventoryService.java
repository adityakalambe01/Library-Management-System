package com.library_management_system.service.inventory_services;

import com.library_management_system.dao.inventory_dao.GetAllInventoryDAO;
import com.library_management_system.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllInventoryService {
    @Autowired
    GetAllInventoryDAO getAllInventoryDAO;
    public List<Inventory> getAllInventoryEntries(){
        return getAllInventoryDAO.getAllInventoryEntries();
    }
}

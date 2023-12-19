package com.library_management_system.service.inventory_services;

import com.library_management_system.dao.inventory_dao.AddInventoryEntryDAO;
import com.library_management_system.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddInventoryEntryService {
    @Autowired
    AddInventoryEntryDAO addInventoryEntryDAO;
    public Boolean addInventoryEntry(Inventory inventory){
        return addInventoryEntryDAO.addInventoryEntry(inventory);
    }
}

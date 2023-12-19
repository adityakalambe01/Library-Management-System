package com.library_management_system.service.inventory_services;

import com.library_management_system.dao.inventory_dao.UpdateInventoryDAO;
import com.library_management_system.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateInventoryService {
    @Autowired
    UpdateInventoryDAO updateInventoryDAO;
    public Boolean updateInventory(Inventory inventory){
        return updateInventoryDAO.updateInventory(inventory);
    }
}

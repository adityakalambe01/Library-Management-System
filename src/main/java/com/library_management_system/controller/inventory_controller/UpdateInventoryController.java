package com.library_management_system.controller.inventory_controller;

import com.library_management_system.entity.Inventory;
import com.library_management_system.service.inventory_services.UpdateInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateInventoryController {
    @Autowired
    UpdateInventoryService updateInventoryService;
    @RequestMapping(value = "/updateInventory", method = RequestMethod.PUT)
    public Boolean updateInventory(@RequestBody Inventory inventory){
        return updateInventoryService.updateInventory(inventory);
    }
}

package com.library_management_system.controller.inventory_controller;

import com.library_management_system.entity.Inventory;
import com.library_management_system.service.inventory_services.AddInventoryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddInventoryEntryController {
    @Autowired
    AddInventoryEntryService addInventoryEntryService;
    @RequestMapping(value = "/addInventory",method = RequestMethod.POST)
    public Boolean addInventoryEntry(@RequestBody Inventory inventory){
        return addInventoryEntryService.addInventoryEntry(inventory);
    }
}

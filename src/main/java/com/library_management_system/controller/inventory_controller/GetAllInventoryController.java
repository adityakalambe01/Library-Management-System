package com.library_management_system.controller.inventory_controller;

import com.library_management_system.entity.Inventory;
import com.library_management_system.service.inventory_services.GetAllInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllInventoryController {
    @Autowired
    GetAllInventoryService getAllInventoryService;
    @RequestMapping(value = "/getAllInventory",method = RequestMethod.GET)
    public List<Inventory> getAllInventoryEntries(){
        return getAllInventoryService.getAllInventoryEntries();
    }
}

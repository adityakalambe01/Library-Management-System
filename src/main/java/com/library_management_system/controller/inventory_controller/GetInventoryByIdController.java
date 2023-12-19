package com.library_management_system.controller.inventory_controller;

import com.library_management_system.entity.Inventory;
import com.library_management_system.service.inventory_services.GetInventoryByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
public class GetInventoryByIdController {
    @Autowired
    GetInventoryByIdService getInventoryByIdService;
    @RequestMapping(value = "/getInventoryById/{bookId}", method = RequestMethod.GET)
    public Inventory getInventoryById(@PathVariable Long bookId){
        return getInventoryByIdService.getInventoryById(bookId);
    }
}

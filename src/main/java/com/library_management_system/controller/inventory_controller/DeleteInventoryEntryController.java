package com.library_management_system.controller.inventory_controller;

import com.library_management_system.service.inventory_services.DeleteInventoryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteInventoryEntryController {
    @Autowired
    DeleteInventoryEntryService deleteInventoryEntryService;
    @RequestMapping(value = "/deleteInventory/{bookId}")
    public boolean deleteInventoryEntry(@PathVariable Long bookId){
        return deleteInventoryEntryService.deleteInventoryEntry(bookId);
    }
}

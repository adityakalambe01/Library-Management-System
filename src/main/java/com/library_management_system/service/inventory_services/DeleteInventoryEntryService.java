package com.library_management_system.service.inventory_services;

import com.library_management_system.dao.inventory_dao.DeleteInventoryEntryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteInventoryEntryService {
    @Autowired
    DeleteInventoryEntryDAO deleteInventoryEntryDAO;
    public boolean deleteInventoryEntry(Long bookId){
        return deleteInventoryEntryDAO.deleteInventoryEntry(bookId);
    }
}

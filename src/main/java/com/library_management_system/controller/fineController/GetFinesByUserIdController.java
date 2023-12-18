package com.library_management_system.controller.fineController;

import com.library_management_system.entity.Fine;
import com.library_management_system.service.fine_services.GetFinesByUserIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetFinesByUserIdController {
    @Autowired
    GetFinesByUserIdService getFinesByUserIdService;
    @RequestMapping(value = "/getFinesByUserId/{userId}",method = RequestMethod.GET)
    public List<Fine> getFinesByUserId(@PathVariable Long userId){
        return getFinesByUserIdService.getFinesByUserId(userId);
    }
}

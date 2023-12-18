package com.library_management_system.controller.fineController;

import com.library_management_system.entity.Fine;
import com.library_management_system.service.fine_services.GetAllFinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllFinesController {
    @Autowired
    GetAllFinesService getAllFinesService;
    @RequestMapping(value = "/getAllFines", method = RequestMethod.GET)
    public List<Fine> getAllFines(){
        return getAllFinesService.getAllFines();
    }
}

package com.library_management_system.controller.fineController;

import com.library_management_system.entity.Fine;
import com.library_management_system.service.fine_services.GetFineByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetFineByIdController {
    @Autowired
    GetFineByIdService getAllFines;
    @RequestMapping(value = "/getFineById/{fineId}", method = RequestMethod.GET)
    public Fine getFineById(@PathVariable Long fineId){
        return getAllFines.getFineById(fineId);
    }
}

package com.library_management_system.controller.fineController;

import com.library_management_system.service.fine_services.PayFineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayFineController {
    @Autowired
    PayFineService payFineService;
    @RequestMapping(value = "/payFine/{fineId}", method = RequestMethod.POST)
    public String payFine(@PathVariable Long fineId){
        return payFineService.payFine(fineId);
    }
}

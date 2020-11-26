package com.akhtar.jpahibernatedemo;


import com.akhtar.jpahibernatedemo.model.Owner;
import com.akhtar.jpahibernatedemo.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class OwnerController {

    private OwnerService ownerService; // Spring vil selv komme med objektet hertil

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({ "/owners/", "/owners", "owners/index"})
    public String getOwners(Model model){

        System.out.println("Owners: ");
        Set<Owner> owners = ownerService.findAll();
        model.addAttribute("owners", owners);
        System.out.println(owners.size());
        return "Owners/index";
    }

}

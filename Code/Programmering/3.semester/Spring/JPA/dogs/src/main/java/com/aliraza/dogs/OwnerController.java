package com.aliraza.dogs;


import com.aliraza.dogs.model.Owner;
import com.aliraza.dogs.service.jpadata.OwnerJPA;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OwnerController {

    private OwnerJPA ownerJPA;

    public OwnerController(OwnerJPA ownerJPA) {
        this.ownerJPA = ownerJPA;
    }

    @PostMapping("/createOwner")
    public String createOwner(Owner owner){

        ownerJPA.save(owner);



        return "redirect:/";
    }

}

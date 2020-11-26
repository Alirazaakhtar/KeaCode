package com.aliraza.obligatoriskjpa;

import com.aliraza.obligatoriskjpa.model.Owner;
import com.aliraza.obligatoriskjpa.service.OwnerServiceJPA;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Lob;


@Controller
public class HomeController {


private OwnerServiceJPA ownerServiceJPA;

    public HomeController(OwnerServiceJPA ownerServiceJPA) {
        this.ownerServiceJPA = ownerServiceJPA;
    }

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("owners", ownerServiceJPA.findAll());

        return "index";

    }


    @PostMapping("/createOwner")
    public String create(@ModelAttribute Owner owner){

        ownerServiceJPA.save(owner);
        System.out.println("created");

        return "redirect:/";
    }

    @PostMapping("/edited")
    public String edit(Owner owner){
        ownerServiceJPA.save(owner);
        return "redirect:/";
    }

    @GetMapping("/delete{id}")
    public String edit(@PathVariable("id") Long id){
        ownerServiceJPA.deleteById(id);
        return "redirect:/";
    }
}

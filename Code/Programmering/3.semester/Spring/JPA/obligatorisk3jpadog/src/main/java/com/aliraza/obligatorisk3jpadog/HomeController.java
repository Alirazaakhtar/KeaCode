package com.aliraza.obligatorisk3jpadog;


import com.aliraza.obligatorisk3jpadog.model.Dog;
import com.aliraza.obligatorisk3jpadog.model.Owner;
import com.aliraza.obligatorisk3jpadog.service.dog.DogServiceJPA;
import com.aliraza.obligatorisk3jpadog.service.owner.OwnerServiceJPA;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.Optional;

@Controller
public class HomeController {

    private OwnerServiceJPA ownerServiceJPA;
    private DogServiceJPA dogServiceJPA;

    public HomeController(OwnerServiceJPA ownerServiceJPA, DogServiceJPA dogServiceJPA) {
        this.ownerServiceJPA = ownerServiceJPA;
        this.dogServiceJPA = dogServiceJPA;
    }

    @GetMapping("/")
   public String index(Model model){

        //laver variable som kan hentes op html
       model.addAttribute("owners", ownerServiceJPA.findAll());
       model.addAttribute("dogs", dogServiceJPA.getOwnerLessDogs());
       model.addAttribute("adopt", dogServiceJPA.getOwnerDogs());


       return "index";
   }

   @PostMapping("/adopt")
    public String adoptDog(@ModelAttribute Owner owner, @RequestParam int dogid){





       Optional<Dog> dog = dogServiceJPA.findById(dogid);
       Optional<Owner> owner1 = ownerServiceJPA.findById(owner.getId());

       if(owner1.get().getDogs() == null){
           owner1.get().setDogs(new HashSet<>());
       }
       if(dog.isPresent()){
           dog.get().setOwner(owner);
           owner1.get().getDogs().add(dog.get());

           //opdater
           dogServiceJPA.save(dog.get());
           ownerServiceJPA.save(owner);
       }


        return "redirect:/";
   }
}

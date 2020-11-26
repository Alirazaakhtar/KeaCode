package com.aliraza.dogs;


import com.aliraza.dogs.model.Dog;
import com.aliraza.dogs.model.Owner;
import com.aliraza.dogs.repositories.DogRepository;
import com.aliraza.dogs.service.DogService;
import com.aliraza.dogs.service.OwnerService;
import com.aliraza.dogs.service.jpadata.DogJPA;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Optional;

@Controller
public class HomeController {

  private DogService dogService;
  private OwnerService ownerService;
  private final String LOGINSTATUS = "loginstatus";

    public HomeController(DogService dogService, OwnerService ownerService) {
        this.dogService = dogService;
        this.ownerService = ownerService;
    }

    @GetMapping("/")
    public String index(Model model, HttpSession httpSession){



        model.addAttribute("dogs", dogService.getOwnersDogs());
        model.addAttribute("owners", ownerService.findAll());
        model.addAttribute("ownerlessdogs", dogService.getOwnerslessDogs());

        return "index";
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String user, @RequestParam("password") String pass, HttpSession httpSession
    ){

        if(user.equals("Ali") && pass.equals("1234")){
            httpSession.setAttribute(LOGINSTATUS, "yes");
        }

        return "redirect:/";
    }

    @GetMapping("/dogs")
    public String dogs(Model model) {


        return "doghome";
    }

    @PostMapping("/createDogs")
    public String createdDog(@ModelAttribute Dog dog){


        dogService.save(dog);
        System.out.println("dog created");

        return "redirect:/";
    }


    @PostMapping("/adopt")
    public String addDogToOwner(Owner owner, @RequestParam("dogid") String dogid ){


        Optional<Dog> dog = dogService.findById(Long.parseLong(dogid));
        Optional<Owner> owner1 = ownerService.findById(owner.getId());

        if(owner1.get().getDogs() == null){
            owner1.get().setDogs(new HashSet<>());
        }
        if(dog.isPresent()){
            dog.get().setOwner(owner);
            owner1.get().getDogs().add(dog.get());
            dogService.save(dog.get());
            ownerService.save(owner);
        }
        System.out.println(owner.getName());


        return "redirect:/";
    }








}

package com.aliaza.recap19a;


import com.aliaza.recap19a.Models.Person;
import com.aliaza.recap19a.Repositories.PersonRep;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class HomeController {

    // IndexOF betyder at den finder objektet number i List

//    private ArrayList<Person> list = new ArrayList<>();

        private PersonRep personRep;

    public HomeController() {
        personRep = new PersonRep();

    }


    @GetMapping("/")
    public String index(Model model) {


        model.addAttribute("list", personRep.getAllPerson());

        return "index";
    }

    @PostMapping("/add")
    public String add(@RequestParam String username){
        System.out.println(username);



        return "redirect:/";
    }

    @PostMapping("/create")
    public String create(Person person){

        personRep.create(person);
        System.out.println(person.getName() + " Id: " + person.getId());
        System.out.println("so many persons in the list: " + personRep.getAllPerson().size());

        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam String id){


        personRep.delete(id);

//        System.out.println("delete er kaldet på " + id);
//        for (int i = 0; i < personRep.getAllPerson().size() ; i++) {
//            if(personRep.getAllPerson().get(i).getId().equals(id)){
//                personRep.delete(personRep.getAllPerson().get(i).getId());
//            }
//        }
        return "redirect:/";
    }


    @PostMapping("/edit")
    public String edit(Person person){


        personRep.edit(person);

//        for (int i = 0; i < list.size() ; i++) {
//            if(list.get(i).getId().equals(person.getId())){
//                list.get(i).setName(person.getName());
//                list.get(i).setAge(person.getAge());
//                list.get(i).setNationality(person.getNationality());
//            }
//
//        }

        return "redirect:/";
    }


}

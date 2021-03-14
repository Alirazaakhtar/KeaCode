package com.aliraza.eksamenprogrammering.controller;

import com.aliraza.eksamenprogrammering.model.Supervisor;
import com.aliraza.eksamenprogrammering.service.studentservice.StudentServiceJPA;
import com.aliraza.eksamenprogrammering.service.supervisor.SupervisorServiceJPA;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    private StudentServiceJPA studentServiceJPA;

    private SupervisorServiceJPA supervisorServiceJPA;

    public HomeController(StudentServiceJPA studentServiceJPA, SupervisorServiceJPA supervisorServiceJPA) {
        this.studentServiceJPA = studentServiceJPA;
        this.supervisorServiceJPA = supervisorServiceJPA;
    }

    @GetMapping("/")
    public String index(Model model) {

        //Vi henter listen fra databasen og sætter den lig med en Arrayliste
        ArrayList<Supervisor> superlist = supervisorServiceJPA.getAll();
        // Her definerer vi variable navnet som til bruges på html siden og sætter den lig med listen
        model.addAttribute("superlist", superlist);

        for (int i = 0; i < superlist.size(); i++) {
            System.out.println(superlist.get(i).getName());
        }

        return "index";
    }

}

package com.aliraza.eksamenprospring.controller;


import com.aliraza.eksamenprospring.model.Supervisor;
import com.aliraza.eksamenprospring.service.student.JpaStudentService;
import com.aliraza.eksamenprospring.service.supervisor.JpaSupervisorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {


    private JpaStudentService jpaStudentService;
    private JpaSupervisorService jpaSupervisorService;

    public HomeController(JpaStudentService jpaStudentService, JpaSupervisorService jpaSupervisorService) {
        this.jpaStudentService = jpaStudentService;
        this.jpaSupervisorService = jpaSupervisorService;
    }

    @GetMapping("/")
    public String index(Model model) {

        //Vi henter listen fra databasen og sætter den lig med en Arrayliste
        ArrayList<Supervisor> superlist = jpaSupervisorService.getAll();
        // Her definerer vi variable navnet som til bruges på html siden og sætter den lig med listen
        model.addAttribute("superlist", superlist);
        System.out.println(superlist);


        return "index";
    }


    @GetMapping("/allStudents")
    public String allStudents(){

        return "allstudents";
    }


    @GetMapping("/delete")
    public String deleteStudent(Model model){

        model.addAttribute("list", jpaStudentService.getAll());
        model.addAttribute("superlist", jpaSupervisorService.getAll());

        return"deleteStudent";
    }


}

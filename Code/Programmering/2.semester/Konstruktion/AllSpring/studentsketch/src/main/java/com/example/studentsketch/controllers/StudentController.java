package com.example.studentsketch.controllers;

import com.example.studentsketch.model.StudentDTO;
import com.example.studentsketch.repositories.IStudentRepository;
import com.example.studentsketch.repositories.StudentRepositorydb;
import com.example.studentsketch.util.DatabaseConnectionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class StudentController {



    private IStudentRepository studentRepository;


    //Her kan man skifte database
    public StudentController() {

        studentRepository = new StudentRepositorydb();

    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("list", studentRepository.getAllStudent());
        return "index";
    }

    @PostMapping("/create")
    public String input(@ModelAttribute StudentDTO studentDTO){
        studentRepository.createStudent(studentDTO);
        return "redirect:/";
    }

    @GetMapping("/Id")
    public String Id(){
        return "id";
    }

    StudentDTO studentDTO;

    @PostMapping("/getId")
    public String getId(@RequestParam int id){
        studentDTO = studentRepository.getStudent(id);

        return "redirect:/getIdId";
    }


    @GetMapping("/getIdId")
    public String getIdId(Model model){

        model.addAttribute("id", studentDTO.getId());
        model.addAttribute("name", studentDTO.getName());

        return "getId";
    }

}

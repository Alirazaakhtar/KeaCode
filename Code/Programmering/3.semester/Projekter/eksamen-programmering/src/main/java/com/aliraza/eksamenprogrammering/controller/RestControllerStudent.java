package com.aliraza.eksamenprogrammering.controller;


import com.aliraza.eksamenprogrammering.model.Student;
import com.aliraza.eksamenprogrammering.model.Supervisor;
import com.aliraza.eksamenprogrammering.service.studentservice.StudentServiceJPA;
import com.aliraza.eksamenprogrammering.service.supervisor.SupervisorServiceJPA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerStudent {

    private StudentServiceJPA jpa;

    public RestControllerStudent(StudentServiceJPA jpa) {
        this.jpa = jpa;
    }

    @PostMapping("/api/create")
    public ResponseEntity<StudentServiceJPA> create(@RequestBody Student student){

        jpa.save(student);

        System.out.println("student created");

        return ResponseEntity.ok(jpa);
    }

}

package com.aliraza.eksamenprospring.controller;

import com.aliraza.eksamenprospring.model.Student;
import com.aliraza.eksamenprospring.service.student.JpaStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {

    private JpaStudentService jpa;

    public StudentRestController(JpaStudentService jpa) {
        this.jpa = jpa;
    }

    @PostMapping("/api/create")
        public ResponseEntity<Student> create(@RequestBody Student student) {

        Student s1 = jpa.save(student);

        System.out.println("student created");

        return ResponseEntity.ok(s1);
    }

   @PostMapping("/api/getAllStudents")
   public ResponseEntity<JpaStudentService> getAll(){

        jpa.studentList = jpa.getAll();

        return ResponseEntity.ok(jpa);
   }

   @PostMapping("/api/delete")
    public ResponseEntity<JpaStudentService> delete(@RequestBody Student student){

        jpa.deleteById(student.getId());

        return ResponseEntity.ok(jpa);
   }

    @PostMapping("/api/update")
    public ResponseEntity<JpaStudentService> update(@RequestBody Student student){

        jpa.save(student);

        return ResponseEntity.ok(jpa);
    }
}

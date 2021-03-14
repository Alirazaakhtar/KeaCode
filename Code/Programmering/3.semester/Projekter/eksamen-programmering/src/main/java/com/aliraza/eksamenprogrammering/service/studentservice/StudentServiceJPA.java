package com.aliraza.eksamenprogrammering.service.studentservice;

import com.aliraza.eksamenprogrammering.model.Student;
import com.aliraza.eksamenprogrammering.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;


@Service
public class StudentServiceJPA implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceJPA(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> findById(Integer integer) {


        return studentRepository.findById(integer);
    }

    @Override
    public ArrayList<Student> getAll() {
        ArrayList<Student> list = new ArrayList<>();
        studentRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void save(Student obj) {
        studentRepository.save(obj);
    }

    @Override
    public void deleteById(Integer integer) {
        studentRepository.deleteById(integer);
    }
}

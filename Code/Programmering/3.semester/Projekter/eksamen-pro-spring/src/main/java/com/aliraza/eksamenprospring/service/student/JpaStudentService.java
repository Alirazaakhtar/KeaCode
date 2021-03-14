package com.aliraza.eksamenprospring.service.student;


import com.aliraza.eksamenprospring.model.Student;
import com.aliraza.eksamenprospring.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JpaStudentService implements StudentService {

    private StudentRepository studentRepository;

    public JpaStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ArrayList<Student> studentList;

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
    public Student save(Student obj) {

        return studentRepository.save(obj);

    }

    @Override
    public void deleteById(Integer integer) {
        studentRepository.deleteById(integer);
    }
}


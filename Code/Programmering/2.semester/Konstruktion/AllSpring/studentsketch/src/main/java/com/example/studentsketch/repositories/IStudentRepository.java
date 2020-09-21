package com.example.studentsketch.repositories;

import com.example.studentsketch.model.StudentDTO;

import java.util.List;

public interface IStudentRepository {

    public void createStudent(StudentDTO studentDTO);

    public List<StudentDTO> getAllStudent();

    public StudentDTO getStudent(int id);

    public boolean update();

    public boolean delete(int id);

}

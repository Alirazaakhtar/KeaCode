package com.example.studentsketch.repositories;

import com.example.studentsketch.model.StudentDTO;
import com.example.studentsketch.util.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositorydb implements IStudentRepository {

    private Connection conn;

    public StudentRepositorydb(){
        this.conn = DatabaseConnectionManager.getConnection();
    }

    @Override
    public void createStudent(StudentDTO studentDTO) {

        try {
            PreparedStatement prepared = conn.prepareStatement("INSERT INTO student VALUES (?,?)");

            prepared.setInt(1, studentDTO.getId());
            prepared.setString(2, studentDTO.getName());


            prepared.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<StudentDTO> getAllStudent() {

        List<StudentDTO> studentDTOList = new ArrayList<>();


        try {
            Statement statement = conn.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT * from student");

            while (resultSet.next()){
                StudentDTO studentDTO = new StudentDTO();

                studentDTO.setId(resultSet.getInt(1));
                studentDTO.setName(resultSet.getString(2));

                studentDTOList.add(studentDTO);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return studentDTOList;
    }

    @Override
    public StudentDTO getStudent(int id) {

        StudentDTO studentDTO = new StudentDTO();

        PreparedStatement prep = null;
        try {
            prep = conn.prepareStatement("SELECT * FROM student where id = ?");
            prep.setInt(1, id);

            ResultSet rs = prep.executeQuery();

            while (rs.next()){
                studentDTO.setId(rs.getInt(1));
                studentDTO.setName(rs.getString(2));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentDTO;

    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}

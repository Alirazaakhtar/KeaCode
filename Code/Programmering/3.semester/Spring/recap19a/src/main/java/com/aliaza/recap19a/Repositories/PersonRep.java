package com.aliaza.recap19a.Repositories;

import com.aliaza.recap19a.Models.Person;
import com.aliaza.recap19a.util.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRep implements IPersonRep {

    private Connection conn;

    public PersonRep() {
        conn = DatabaseConnectionManager.getConnection();
    }

    @Override
    public void create(Person person) {

        try {
           PreparedStatement pre =  conn.prepareStatement("INSERT INTO person VALUES (?,?,?,?)");
           pre.setString(1, person.getId());
           pre.setString(2, person.getName());
           pre.setInt(3, person.getAge());
           pre.setString(4, person.getNationality());

           pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<Person> getAllPerson() {

        ArrayList<Person> list = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet r = statement.executeQuery("SELECT * from person");

            while (r.next()){
                Person person = new Person();
                person.setId(r.getString(1));
                person.setName(r.getString(2));
                person.setAge(r.getInt(3));
                person.setNationality(r.getString(4));

                list.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean edit(Person person) {

        try {
            PreparedStatement pre = conn.prepareStatement("update person set name = ?, age = ?, nationality = ? where id = ?");
            pre.setString(1, person.getName());
            pre.setInt(2, person.getAge());
            pre.setString(3, person.getNationality());
            pre.setString(4, person.getId());
            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(String id) {

        try {
            PreparedStatement pre = conn.prepareStatement("delete from person where id = ?");
            pre.setString(1, id);
            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }
}

package com.aliaza.recap19a.Repositories;

import com.aliaza.recap19a.Models.Person;

import java.util.List;

public interface IPersonRep {

    public void create(Person person);

    public List<Person> getAllPerson();

    public boolean edit(Person person);

    public boolean delete(String id);

}

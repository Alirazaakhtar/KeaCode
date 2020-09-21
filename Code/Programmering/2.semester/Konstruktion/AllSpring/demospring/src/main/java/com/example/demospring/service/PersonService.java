package com.example.demospring.service;

import com.example.demospring.dao.PersonDAO;
import com.example.demospring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {

    private  final PersonDAO personDAO;

    @Autowired
    public PersonService( PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public  int addPerson(Person person){
        return personDAO.insertPerson(person);
    }
    public List<Person> getAllPerson(){
        return personDAO.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDAO.selectPersonById(id);
    }

    public int deletePerson(UUID id){
        return personDAO.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person person){
        return  personDAO.updatePersonById(id, person);
    }

}

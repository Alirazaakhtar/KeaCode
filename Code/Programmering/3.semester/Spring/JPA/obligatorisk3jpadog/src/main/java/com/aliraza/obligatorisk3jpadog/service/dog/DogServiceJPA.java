package com.aliraza.obligatorisk3jpadog.service.dog;


import com.aliraza.obligatorisk3jpadog.model.Dog;
import com.aliraza.obligatorisk3jpadog.model.Owner;
import com.aliraza.obligatorisk3jpadog.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.*;


@Service

public class DogServiceJPA implements DogService {

    public Set<Owner> dog = new HashSet<>();

    private final DogRepository dogRepository;

    public DogServiceJPA(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Set<Dog> findAll() {
        Set<Dog> dogs = new HashSet<>();
        dogRepository.findAll().forEach(dogs::add);
        return dogs;
    }

    @Override
    public Dog save(Dog object) {
        return dogRepository.save(object);
    }

    @Override
    public void delete(Dog obj) {
        dogRepository.delete(obj);
    }

    @Override
    public void deleteById(Integer integer) {
        deleteById(integer);
    }

    @Override
    public Optional<Dog> findById(Integer integer) {
        return dogRepository.findById(integer);
    }

    @Override
    public List<Dog> getOwnerLessDogs() {
        ArrayList<Dog> dogs = new ArrayList<>();
       dogRepository.findAll().forEach(dog1 -> {
           if(dog1.getOwner() == null){
               dogs.add(dog1);
           }
       });
        return dogs;
    }

    @Override
    public List<Dog> getOwnerDogs() {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogRepository.findAll().forEach(dog1 -> {
            if(dog1.getOwner() != null){
                dogs.add(dog1);
            }
        });
        return dogs;
    }
}

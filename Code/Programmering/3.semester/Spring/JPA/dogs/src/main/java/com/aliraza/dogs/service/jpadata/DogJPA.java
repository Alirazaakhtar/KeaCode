package com.aliraza.dogs.service.jpadata;

import com.aliraza.dogs.model.Dog;
import com.aliraza.dogs.repositories.DogRepository;
import com.aliraza.dogs.service.DogService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service // den gør at, en instans fra denne klasse bliver oprettet, og
// sat ind i OwnerController via konstruktør

public class DogJPA implements DogService {


    // initialiser auto
private final DogRepository dogRepository;

    public DogJPA(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Set<Dog> findAll() {
        Set<Dog> set = new HashSet<>();
        dogRepository.findAll().forEach(set::add);
        return set;
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
    public void deleteById(Long aLong) {
dogRepository.deleteById(aLong);
    }

    @Override
    public Optional<Dog> findById(Long aLong) {
        return dogRepository.findById(aLong);
    }


    @Override
    public List<Dog> getOwnerslessDogs() {

        List<Dog> list = new ArrayList<>();
        dogRepository.findAll().forEach(dog -> {
            if(dog.getOwner() == null){
                list.add(dog);
            }
        });

        return list;
    }

    @Override
    public List<Dog> getOwnersDogs() {
        List<Dog> list = new ArrayList<>();
        dogRepository.findAll().forEach(dog -> {
            if (dog.getOwner() != null){
                list.add(dog);
            }
        });
        return list;
    }

    @Override
    public List<Dog> getTwoDogs(int start, int number) {

        List<Dog> list = new ArrayList<>();
        Pageable getNDogs = PageRequest.of(start,number, Sort.by("name"));
        dogRepository.findAll(getNDogs).forEach(list::add);


        return list;
    }
}

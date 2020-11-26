package com.aliraza.obligatorisk3jpadog.service.dog;

import com.aliraza.obligatorisk3jpadog.model.Dog;
import com.aliraza.obligatorisk3jpadog.service.CrudService;

import java.util.List;

public interface DogService extends CrudService<Dog, Integer> {

    List<Dog> getOwnerLessDogs();

    List<Dog> getOwnerDogs();
}

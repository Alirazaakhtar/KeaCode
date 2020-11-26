package com.aliraza.dogs.service;

import com.aliraza.dogs.model.Dog;

import java.util.List;

public interface DogService extends CrudService<Dog, Long> {
    public List<Dog> getOwnerslessDogs();

    public List<Dog> getOwnersDogs();

    public List<Dog> getTwoDogs(int start, int number);
}

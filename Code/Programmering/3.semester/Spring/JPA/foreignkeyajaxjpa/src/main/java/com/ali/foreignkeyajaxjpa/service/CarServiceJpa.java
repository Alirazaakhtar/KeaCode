package com.ali.foreignkeyajaxjpa.service;

import com.ali.foreignkeyajaxjpa.model.Car;
import com.ali.foreignkeyajaxjpa.repositories.CarsRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Service
public class CarServiceJpa implements CarsService {


    private final CarsRepository carsRepository;
    public Set<Car> carList;

    public CarServiceJpa(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;

        //Til AJAX
        carList = new HashSet<>();
        carsRepository.findAll().forEach(carList::add);
    }

    @Override
    public void save(Car obj) {
        carsRepository.save(obj);
    }

    @Override
    public Set<Car> findAll() {
        Set<Car> cars = new HashSet<>();
        carsRepository.findAll().forEach(cars::add);
        return cars;
    }

    @Override
    public void deleteById(Integer integer) {
        carsRepository.deleteById(integer);
    }
}

package com.ali.foreignkeyajaxjpa.repositories;

import com.ali.foreignkeyajaxjpa.model.Car;
import com.ali.foreignkeyajaxjpa.service.CarsService;
import org.springframework.data.repository.CrudRepository;

public interface CarsRepository extends CrudRepository<Car, Integer> {
}

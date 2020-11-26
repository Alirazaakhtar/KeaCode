package com.aliraza.obligatorisk3jpadog.repositories;

import com.aliraza.obligatorisk3jpadog.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Integer> {
}

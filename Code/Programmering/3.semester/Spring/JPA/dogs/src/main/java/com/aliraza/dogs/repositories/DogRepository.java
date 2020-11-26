package com.aliraza.dogs.repositories;

import com.aliraza.dogs.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DogRepository extends PagingAndSortingRepository<Dog, Long> {
}

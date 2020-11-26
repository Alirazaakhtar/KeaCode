package com.aliraza.dogs.repositories;

import com.aliraza.dogs.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

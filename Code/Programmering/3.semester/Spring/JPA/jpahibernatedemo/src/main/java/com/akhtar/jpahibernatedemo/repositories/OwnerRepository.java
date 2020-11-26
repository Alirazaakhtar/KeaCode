package com.akhtar.jpahibernatedemo.repositories;

import com.akhtar.jpahibernatedemo.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> { // som er fra jpa

    // CrudRepository er fra Spring --------^

}

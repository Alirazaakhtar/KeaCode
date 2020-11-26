package com.akhtar.jpahibernatedemo.service;

import java.util.Optional;
import java.util.Set;

public interface CrudService<T, ID> { // Super interfzce til flere services


    Set<T> findAll();

    T save(T object);

    void delete(T obj);

    void deleteById(ID id);

    Optional<T> findById(ID id); // man bruger optional fordi man ikke ved om id'et er null

}

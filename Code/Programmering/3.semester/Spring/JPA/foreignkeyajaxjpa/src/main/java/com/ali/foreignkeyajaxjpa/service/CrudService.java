package com.ali.foreignkeyajaxjpa.service;

import java.util.Set;

public interface CrudService<T, ID> {

    void save(T obj);

    Set<T> findAll();

    void deleteById(ID id);


}

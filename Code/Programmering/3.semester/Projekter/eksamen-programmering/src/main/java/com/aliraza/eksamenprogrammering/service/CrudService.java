package com.aliraza.eksamenprogrammering.service;

import java.util.ArrayList;
import java.util.Optional;

public interface CrudService<T, ID> {

    public Optional<T> findById(ID id);

    public ArrayList<T> getAll();

    public void save(T obj);

    public void deleteById(ID id);
}

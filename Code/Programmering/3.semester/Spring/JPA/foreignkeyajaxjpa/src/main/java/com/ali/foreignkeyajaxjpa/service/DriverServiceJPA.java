package com.ali.foreignkeyajaxjpa.service;

import com.ali.foreignkeyajaxjpa.model.Driver;
import com.ali.foreignkeyajaxjpa.repositories.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DriverServiceJPA implements DriverService {


    private final DriverRepository driverRepository;

    public DriverServiceJPA(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public void save(Driver obj) {
        driverRepository.save(obj);
    }

    @Override
    public Set<Driver> findAll() {
        Set<Driver> set = new HashSet<>();
        driverRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public void deleteById(Integer aLong) {
        driverRepository.deleteById(aLong);
    }
}

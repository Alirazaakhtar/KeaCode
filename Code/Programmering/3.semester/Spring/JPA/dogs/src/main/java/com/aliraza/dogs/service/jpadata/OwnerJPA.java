package com.aliraza.dogs.service.jpadata;

import com.aliraza.dogs.model.Owner;
import com.aliraza.dogs.repositories.OwnerRepository;
import com.aliraza.dogs.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
public class OwnerJPA implements OwnerService {


    private final OwnerRepository ownerRepository;

    public OwnerJPA(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }




    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner obj) {
        ownerRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public Optional<Owner> findById(Long aLong) {
        return ownerRepository.findById(aLong);
    }
}

package com.akhtar.jpahibernatedemo.service.springdatajpa;

import com.akhtar.jpahibernatedemo.model.Owner;
import com.akhtar.jpahibernatedemo.repositories.OwnerRepository;
import com.akhtar.jpahibernatedemo.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service // den gør at, en instans fra denne klasse bliver oprettet, og
// sat ind i OwnerController via konstruktør
public class OwnerJPA implements OwnerService {

    private final OwnerRepository ownerRepository;

    /// spring vil selv oprette en instans, som implementerer OwnerRepository^
    // metoder fra OwnerRepository oprettet af spring
    public OwnerJPA(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> set = new HashSet<>();
        ownerRepository.findAll().forEach(set::add);// tilføjer alle elementer til set

        return set;
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

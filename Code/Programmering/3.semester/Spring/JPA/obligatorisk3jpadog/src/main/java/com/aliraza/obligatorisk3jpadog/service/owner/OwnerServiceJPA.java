package com.aliraza.obligatorisk3jpadog.service.owner;

import com.aliraza.obligatorisk3jpadog.model.Owner;
import com.aliraza.obligatorisk3jpadog.repositories.OwnerRepository;
import com.aliraza.obligatorisk3jpadog.service.owner.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class OwnerServiceJPA implements OwnerService {

    public Set<Owner> owners = new HashSet<>();

    private final OwnerRepository ownerRepository;

    public OwnerServiceJPA(OwnerRepository ownerRepository) {
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
    public void deleteById(Integer integer) {
ownerRepository.deleteById(integer);
    }

    @Override
    public Optional<Owner> findById(Integer integer) {
        return ownerRepository.findById(integer);
    }
}

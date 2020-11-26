package com.aliraza.obligatoriskjpa.service;


import com.aliraza.obligatoriskjpa.model.Owner;
import com.aliraza.obligatoriskjpa.repositories.OnwerRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class OwnerServiceJPA implements OwnerService {


    private final OnwerRepository onwerRepository;

    public OwnerServiceJPA(OnwerRepository onwerRepository) {
        this.onwerRepository = onwerRepository;
    }

    @Override
    public Set<Owner> findAll(){

        Set<Owner> set = new HashSet<>();
        onwerRepository.findAll().forEach(set::add);

        return set;

    }

    @Override
    public Owner save(Owner object){
        return onwerRepository.save(object);
    }

    @Override
    public void delete(Owner obj){
        onwerRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id){
        onwerRepository.deleteById(id);
    }

    @Override
    public Optional<Owner> findById(Long id){
       return onwerRepository.findById(id);
    }

}

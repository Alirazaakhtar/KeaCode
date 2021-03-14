package com.aliraza.eksamenprogrammering.service.supervisor;

import com.aliraza.eksamenprogrammering.model.Supervisor;
import com.aliraza.eksamenprogrammering.repository.SupervisorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class SupervisorServiceJPA implements SupervisorService {


    private SupervisorRepository supervisorRepository;

    public SupervisorServiceJPA(SupervisorRepository supervisorRepository) {
        this.supervisorRepository = supervisorRepository;
    }

    @Override
    public Optional<Supervisor> findById(Integer integer) {

        return supervisorRepository.findById(integer);
    }

    @Override
    public ArrayList<Supervisor> getAll() {
        ArrayList<Supervisor> list = new ArrayList<>();
        supervisorRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void save(Supervisor obj) {
        supervisorRepository.save(obj);
    }

    @Override
    public void deleteById(Integer integer) {
        supervisorRepository.deleteById(integer);
    }
}

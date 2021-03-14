package com.aliraza.eksamenprospring.service.supervisor;

import com.aliraza.eksamenprospring.model.Supervisor;
import com.aliraza.eksamenprospring.repository.SupervisorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JpaSupervisorService implements SupervisorService {

    private SupervisorRepository supervisorRepository;

    public JpaSupervisorService(SupervisorRepository supervisorRepository) {
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
    public Supervisor save(Supervisor obj) {

        return supervisorRepository.save(obj);

    }

    @Override
    public void deleteById(Integer integer) {
        supervisorRepository.deleteById(integer);
    }
}

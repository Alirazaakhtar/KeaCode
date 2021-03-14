package com.aliraza.eksamenprospring.repository;

import com.aliraza.eksamenprospring.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}

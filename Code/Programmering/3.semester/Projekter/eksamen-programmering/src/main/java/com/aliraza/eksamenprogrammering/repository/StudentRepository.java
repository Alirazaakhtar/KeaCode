package com.aliraza.eksamenprogrammering.repository;

import com.aliraza.eksamenprogrammering.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}

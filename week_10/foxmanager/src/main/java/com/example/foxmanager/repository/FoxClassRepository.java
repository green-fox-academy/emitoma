package com.example.foxmanager.repository;

import com.example.foxmanager.model.FoxClass;
import com.example.foxmanager.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoxClassRepository extends CrudRepository<FoxClass, Long> {
    Optional<FoxClass> findByClassName(String className);
}

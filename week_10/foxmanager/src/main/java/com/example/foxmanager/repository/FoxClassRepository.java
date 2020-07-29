package com.example.foxmanager.repository;

import com.example.foxmanager.model.FoxClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxClassRepository extends CrudRepository<FoxClass, Long> {
}

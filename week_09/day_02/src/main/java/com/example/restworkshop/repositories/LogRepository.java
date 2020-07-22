package com.example.restworkshop.repositories;

import com.example.restworkshop.model.enities.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LogRepository extends CrudRepository<Log, Long> {
    Optional<Log> findByCreatedAt(String endpoint);
}

package com.example.orientationexampleexam.repository;

import com.example.orientationexampleexam.model.SecretCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretCodeRepository extends CrudRepository<SecretCode, Long
        > {
}

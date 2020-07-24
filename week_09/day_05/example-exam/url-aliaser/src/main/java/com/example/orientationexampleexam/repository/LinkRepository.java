package com.example.orientationexampleexam.repository;

import com.example.orientationexampleexam.model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
    Optional<Link> findByUrl(String url);
}

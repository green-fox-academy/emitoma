package com.example.orientationexampleexam.repository;

import com.example.orientationexampleexam.model.Link;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
    Optional<Link> findByUrl(String url);

    Optional<Link> findByAlias(String alias);

//    @Query("SELECT secret_code.secret_code FROM secret_code INNER JOIN link ON secret_code.id = link.secret_code_id")



//    from Cat as cat
//    join cat.mate as mate
//    left join cat.kittens as kitten}
//    SELECT secret_code.secret_code
//        FROM secret_code
//        INNER JOIN link ON secret_code.id = link.secret_code_id;

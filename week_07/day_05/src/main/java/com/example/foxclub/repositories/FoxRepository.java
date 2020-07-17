package com.example.foxclub.repositories;

import com.example.foxclub.model.Fox;
import com.example.foxclub.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface FoxRepository extends CrudRepository<Fox, Long> {
    @Query("SELECT name FROM Fox WHERE owner=:owner")
    String getFoxNameByOwner(@Param("owner") User owner);

}

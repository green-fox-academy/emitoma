package com.example.foxclub.repositories;

import com.example.foxclub.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
   Optional<User> findByUserName(String userName);

}

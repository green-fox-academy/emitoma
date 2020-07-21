package com.example.redditproject.repositories;

import com.example.redditproject.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUserName(String userName);

    @Modifying
    @Query("UPDATE User u SET u.isOnline =:isOnline WHERE u.userName=:userName")
    void setUserOnline(@Param("isOnline") boolean isOnline, @Param("userName") String userName);




}

package com.example.todosqlproject.repository;

import com.example.todosqlproject.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> getAllByDoneIsFalse();
    List<Todo> findByTitleContaining(String search);
}

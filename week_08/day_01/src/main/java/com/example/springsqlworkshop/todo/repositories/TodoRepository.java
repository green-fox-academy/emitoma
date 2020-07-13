package com.example.springsqlworkshop.todo.repositories;

import com.example.springsqlworkshop.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

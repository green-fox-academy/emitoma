package com.example.todosqlproject.service;

import com.example.todosqlproject.model.Todo;
import com.example.todosqlproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listActive() {
        return todoRepository.getAllByDoneIsFalse();
    }
}

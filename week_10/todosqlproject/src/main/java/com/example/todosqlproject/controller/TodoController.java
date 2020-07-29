package com.example.todosqlproject.controller;

import com.example.todosqlproject.model.Todo;
import com.example.todosqlproject.repository.TodoRepository;
import com.example.todosqlproject.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private TodoRepository todoRepository;
    private TodoService todoService;

    @Autowired
    public TodoController(TodoRepository todoRepository, TodoService todoService) {
        this.todoRepository = todoRepository;
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", "/list"})
    public List<Todo> list() {
        List<Todo> activeTodos = (List<Todo>) todoService.listActive();
        return activeTodos;
    }
}

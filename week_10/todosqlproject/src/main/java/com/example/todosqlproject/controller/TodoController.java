package com.example.todosqlproject.controller;

import com.example.todosqlproject.model.Todo;
import com.example.todosqlproject.repository.TodoRepository;
import com.example.todosqlproject.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add")
    public String addTodo() {
        return "Add new todo";
    }

    @PostMapping("/add")
    public String addTodo(@RequestBody Todo todo) {
        todoService.addNewTodo(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return "redirect:/todo/list";
    }

    

}

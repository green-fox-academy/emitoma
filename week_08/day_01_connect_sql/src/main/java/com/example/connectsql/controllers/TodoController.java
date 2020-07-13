package com.example.connectsql.controllers;

import com.example.connectsql.model.Todo;
import com.example.connectsql.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        Iterable<Todo> todos = todoRepository.findAll();
        model.addAttribute("todos", todos);
        return "todolist";
    }
}

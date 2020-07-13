package com.example.springsqlworkshop.todo.controllers;

import com.example.springsqlworkshop.todo.model.Todo;
import com.example.springsqlworkshop.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

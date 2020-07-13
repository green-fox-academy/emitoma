package com.example.connectsql.controllers;

import com.example.connectsql.model.Todo;
import com.example.connectsql.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping(value = {"/", "/list"})
    public String list(@RequestParam(defaultValue = "true") boolean isActive, Model model) {
        ArrayList<Todo> todos = (ArrayList<Todo>) todoRepository.findAll();
        if (!isActive) {
            model.addAttribute("todos", todos);
        } else {
            List<Todo> activeTodos = todos.stream()
                    .filter(todo -> !todo.isIsDone())
                    .collect(Collectors.toList());

            model.addAttribute("todos", activeTodos);
        }
        System.out.println(isActive);

        return "todolist";
    }
}

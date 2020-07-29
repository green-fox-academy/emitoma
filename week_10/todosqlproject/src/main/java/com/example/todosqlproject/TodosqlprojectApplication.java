package com.example.todosqlproject;

import com.example.todosqlproject.model.Todo;
import com.example.todosqlproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosqlprojectApplication {


    public static void main(String[] args) {
        SpringApplication.run(TodosqlprojectApplication.class, args);
    }


}

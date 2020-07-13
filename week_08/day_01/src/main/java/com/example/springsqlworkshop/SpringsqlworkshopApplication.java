package com.example.springsqlworkshop;

import com.example.springsqlworkshop.todo.model.Todo;
import com.example.springsqlworkshop.todo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringsqlworkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsqlworkshopApplication.class, args);
    }

    @Bean
    public CommandLineRunner todoDB(TodoRepository todoRepository) {
        return args -> {
            todoRepository.save(new Todo("Feed the cat", true, false));
            todoRepository.save(new Todo("Cook dinner", false, true));
            todoRepository.save(new Todo("Do homework", true, false));
            
        };
    }

}

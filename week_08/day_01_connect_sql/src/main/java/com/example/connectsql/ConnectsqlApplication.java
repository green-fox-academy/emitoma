package com.example.connectsql;

import com.example.connectsql.model.Todo;
import com.example.connectsql.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConnectsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectsqlApplication.class, args);
    }

    @Bean
    public CommandLineRunner todoDatabase(TodoRepository todoRepository) {
        return args -> {
            todoRepository.save(new Todo("Feed the cat", true, false));
            todoRepository.save(new Todo("Cook dinner", false, true));
            todoRepository.save(new Todo("Do homework", true, false));

        };
    }
}

package com.example.todosqlproject.service;

import com.example.todosqlproject.model.Todo;
import com.example.todosqlproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Todo addNewTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        Optional<Todo> dbTodo = todoRepository.findById(id);
        if (dbTodo.isPresent()) {
            Todo toDelete = dbTodo.get();
            todoRepository.delete(toDelete);
        }
    }

    public void updateTodo(Long id, Todo todo) {

        Optional<Todo> dbTodo = todoRepository.findById(id);
        if (dbTodo.isPresent()) {
            todo.setId(id);
            todoRepository.save(todo);
        }
    }

    public List<Todo> findTodo(String search) {
        List<Todo> found = todoRepository.findByTitleContaining(search);
        return found;
    }
}

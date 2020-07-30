package com.example.todosqlproject.controller;

import com.example.todosqlproject.model.Assignee;
import com.example.todosqlproject.model.Todo;
import com.example.todosqlproject.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo/assignee")
public class AssigneeController {
    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/list")
    public List<Assignee> listAssignees() {
        return assigneeService.findAll();
    }

    @PutMapping("/{id}/edit")
    public ResponseEntity<?> updateAssignee(@PathVariable Long id,
                                            @RequestBody Assignee assignee) {
        assigneeService.updateAssignee(id, assignee);
        return ResponseEntity.status(302).header("Location", "/todo/assignee/list").body("");
    }

    @PostMapping("/{id}/delete")
    public ResponseEntity<?> deteleAssignee(@PathVariable Long id) {
        assigneeService.removeAssignee(id);
        return ResponseEntity.status(302).header("Location", "/todo/assignee/list").body("");
    }

    @PostMapping("/add")
    public Assignee save(@RequestBody Assignee assignee) {
        return assigneeService.save(assignee);
    }

    @GetMapping("/show-todos")
    public List<Todo> showTodos(){

    }
}

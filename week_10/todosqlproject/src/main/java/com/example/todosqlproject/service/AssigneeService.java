package com.example.todosqlproject.service;

import com.example.todosqlproject.model.Assignee;
import com.example.todosqlproject.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssigneeService {
    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> findAll() {
        return (List<Assignee>) assigneeRepository.findAll();
    }

    public Assignee save(Assignee assignee) {
        return assigneeRepository.save(assignee);
    }

    public void removeAssignee(Long id) {
        Optional<Assignee> dbAssignee = assigneeRepository.findById(id);
        if (dbAssignee.isPresent()) {
            assigneeRepository.delete(dbAssignee.get());
        }
    }

    public void updateAssignee(Long id, Assignee assignee) {
        Optional<Assignee> dbAssignee = assigneeRepository.findById(id);
        if (dbAssignee.isPresent()) {
            assignee.setId(id);
            assigneeRepository.save(assignee);
        }
    }

}

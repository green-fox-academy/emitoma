package com.example.todosqlproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Assignee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    @OneToMany(mappedBy = "assignee")
    @JsonIgnore
    private List<Todo> todos;

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

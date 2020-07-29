package com.example.foxmanager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FoxClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String className;
    private String technology;

    @OneToMany(mappedBy = "classId")
    private List<Student> students;

    public FoxClass(String className, String technology) {
        this.className = className;
        this.technology = technology;
    }
}

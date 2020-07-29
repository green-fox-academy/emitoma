package com.example.foxmanager.service;

import com.example.foxmanager.model.FoxClass;
import com.example.foxmanager.model.Student;
import com.example.foxmanager.repository.FoxClassRepository;
import com.example.foxmanager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    private FoxClassRepository foxClassRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, FoxClassRepository foxClassRepository) {
        this.studentRepository = studentRepository;
        this.foxClassRepository = foxClassRepository;
    }

    public Student saveStudent(String name, Long classId) {
        Optional<FoxClass> dbClass = foxClassRepository.findById(classId);
        if (dbClass.isPresent()) {
//            FoxClass classId = dbClass.get();
            return studentRepository.save(new Student(name, classId));
        }
        return null;
    }
}

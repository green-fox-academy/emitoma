package com.example.foxmanager.service;

import com.example.foxmanager.model.FoxClass;
import com.example.foxmanager.repository.FoxClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxClassService {
    private FoxClassRepository foxClassRepository;

    @Autowired

    public FoxClassService(FoxClassRepository foxClassRepository) {
        this.foxClassRepository = foxClassRepository;
    }

    public FoxClass saveClass(String className, String technology) {
        return foxClassRepository.save(new FoxClass(className, technology));
    }

    public List<FoxClass> findAll() {
        return (List<FoxClass>) foxClassRepository.findAll();
    }
}

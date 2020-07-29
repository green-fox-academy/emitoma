package com.example.foxmanager.controller;

import com.example.foxmanager.model.FoxClass;
import com.example.foxmanager.service.FoxClassService;
import com.example.foxmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class FoxClassController {
    private FoxClassService foxClassService;
    private StudentService studentService;

    @Autowired

    public FoxClassController(FoxClassService foxClassService, StudentService studentService) {
        this.foxClassService = foxClassService;
        this.studentService = studentService;
    }

    @GetMapping("/classes")
    public String classPage(Model model) {
        List<FoxClass> allClass = foxClassService.findAll();
        model.addAttribute("classes", allClass);
        return "class";
    }

    @PostMapping("/classes")
    public String classPage(@RequestParam String className,
                            @RequestParam String technology) {
        foxClassService.saveClass(className, technology);
        return "redirect:/class-info";
    }

    @GetMapping("/class-info")
    public String classInfo(Model model) {
        List<FoxClass> allClass = foxClassService.findAll();
        model.addAttribute("classes", allClass);
        return "classinfo";
    }

    @PostMapping("/class-info")
    public String classInfo(@RequestParam String name,
                            @RequestParam(value = "id") Long id) {
        studentService.saveStudent(name, id);
        return "redirect:/classes";
    }

}

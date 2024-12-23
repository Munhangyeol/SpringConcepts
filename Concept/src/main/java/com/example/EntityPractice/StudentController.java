package com.example.EntityPractice;

import com.example.EntityPractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping("/identity")
    public String saveWithIdentity(){
        service.saveIdentity();
        return "!!";
    }

    @GetMapping("/sequence")
    public String  saveWithSequence(){
       service.saveSequence();
        return "!!";
    }
}

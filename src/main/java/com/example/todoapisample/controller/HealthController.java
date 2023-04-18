package com.example.todoapisample.controller;

import com.example.todoapi.controller.HealthApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // It is needed to add if the class has implements
public class HealthController implements HealthApi {
// It is easy to write with Control+O
    @Override
    @GetMapping("/health")
    public ResponseEntity<Void> healthGet() {
        return ResponseEntity.ok().build();
    }
}
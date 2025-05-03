package com.example.projetweb;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
public class studentList {
    @Autowired
    StudentService studentService ;


    @GetMapping("/send/{numeroEtudiant}")
    public ResponseEntity<Void> envoyerstu (@PathVariable int numeroEtudiant) {

        RestTemplate restTempl = new RestTemplate();
        String url = "http://microsrvc2.default.svc.cluster.local:80/etudiant";
        Optional<Student> std = studentService.getStudentByNumero(numeroEtudiant);
        if (std.isPresent()) {
            String response = restTempl.postForObject(url, std.get(), String.class);
        }
        return ResponseEntity.noContent().build();
    }
}

package com.example.projetweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class StudentWeb {
    @Autowired
    StudentService studentService ;


@GetMapping("/")
public String showHomePage(Model model) {
    return "index1"; // Correspond à la vue index.html
}


@GetMapping("/{numeroEtudiant}")
public String getEtudiant(@PathVariable int numeroEtudiant, Model model) {

        Optional<Student> std = studentService.getStudentByNumero(numeroEtudiant);
        if (std.isPresent()) {
            model.addAttribute("student", std.get());
            return "student";
        } else {
            return "erreur";
        }
    }
}

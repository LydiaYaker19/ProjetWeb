package com.example.projetweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    RestTemplate restTempl;

    public Optional<Student> getStudentByNumero(Integer id) {

        return studentRepository.findById(id);
    }
}

package com.example.demo.service;



import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public void add(Student s) {
        repo.save(s);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

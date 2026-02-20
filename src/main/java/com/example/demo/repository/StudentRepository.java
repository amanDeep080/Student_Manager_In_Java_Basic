package com.example.demo.repository;



import com.example.demo.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Student> mapper = (rs, rowNum) -> new Student(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getString("email"),
            rs.getString("course")
    );

    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM students ORDER BY id DESC", mapper);
    }

    public int save(Student s) {
        return jdbcTemplate.update(
                "INSERT INTO students(name, email, course) VALUES (?, ?, ?)",
                s.getName(), s.getEmail(), s.getCourse()
        );
    }

    public int deleteById(Long id) {
        return jdbcTemplate.update("DELETE FROM students WHERE id = ?", id);
    }
}

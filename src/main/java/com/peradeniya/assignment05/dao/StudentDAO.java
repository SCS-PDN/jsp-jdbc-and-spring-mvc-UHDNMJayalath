package com.peradeniya.assignment05.dao;

import com.peradeniya.assignment05.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Student validate(String email, String password) {
        String query = "SELECT * FROM students WHERE email = ? AND password = ?";
        try {
            Student student = jdbcTemplate.queryForObject(query, new Object[]{email, password},
                    (rs, rowNum) -> new Student(
                            rs.getInt("student_id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("password")
                    ));
            return student;
        } catch (Exception e) {
            return null; // Return null if no student is found with the given credentials
        }
    }
}

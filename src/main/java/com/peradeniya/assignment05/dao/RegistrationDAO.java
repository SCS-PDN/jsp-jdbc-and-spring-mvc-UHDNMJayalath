package com.peradeniya.assignment05.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void register(int studentId, int courseId) {
        jdbcTemplate.update("INSERT INTO registrations (student_id, course_id, date) VALUES (?, ?, ?)",
                studentId, courseId, new Timestamp(new Date().getTime()));
    }
}


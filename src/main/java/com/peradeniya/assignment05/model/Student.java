package com.peradeniya.assignment05.model;

public class Student {
    private int student_id;
    private String name;
    private String email;
    private String password;

    public Student(int student_id, String name, String email, String password) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

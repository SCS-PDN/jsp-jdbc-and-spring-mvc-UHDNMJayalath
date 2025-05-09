CREATE DATABASE university_db;

USE university_db;

CREATE TABLE students (
                          student_id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(80),
                          email VARCHAR(80) UNIQUE,
                          password VARCHAR(80)
);

CREATE TABLE courses (
                         course_id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(80),
                         instructor VARCHAR(80),
                         credits INT
);

CREATE TABLE registrations (
                               reg_id INT AUTO_INCREMENT PRIMARY KEY,
                               student_id INT,
                               course_id INT,
                               date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                               FOREIGN KEY(student_id) REFERENCES students(student_id),
                               FOREIGN KEY(course_id) REFERENCES courses(course_id)
);


INSERT INTO students (name, email, password) VALUES
                                                 ('''Nishaka', 'nishaka@gmail.com', 'nmj12345'),
                                                 ('Mahesh', 'mahesh@email.com', 'mj1278');

INSERT INTO courses (name, instructor, credits) VALUES
                                                    ('Mathematics', 'Dr. kelun', 3),
                                                    ('Computer Science', 'Dr. Ruwanthini', 3),
                                                    ('Physics', 'Dr. Nayanajith', 2);

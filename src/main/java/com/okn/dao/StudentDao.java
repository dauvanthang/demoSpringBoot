package com.okn.dao;

import com.okn.entity.Student;

import java.util.Collection;

public interface StudentDao{
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}

package com.okn.service;

import com.okn.dao.StudentDao;
import com.okn.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    @Qualifier("FakeData")
    private StudentDao studentDao;
    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }
    public void removeStudentById(int id) {
        studentDao.removeStudentById(id);
    }

    public void upDateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudentToDb(student);
    }
}

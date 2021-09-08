package com.xgileit.learning.student.Service.impl;

import com.xgileit.learning.student.Service.StudentService;
import com.xgileit.learning.student.exception.StudentNotFoundException;
import com.xgileit.learning.student.model.Student;

/**
 * This class is the implementation of the service class with the CRUD methods
 */

import java.util.HashMap;
import java.util.Map;


public class StudentServiceImpl implements StudentService {


    Map<Integer,Student> studentMap =new HashMap<>();

    /**
     * This method to add or create a student
     * @param student
     * @return Student
     */

    @Override
    public String addStudent(Student student) {
        studentMap.put(student.getStudentNumber(),student);
        return "student added";

    }
    /**
     * This method to get all the students
     *
     * @return StudentMap
     */

    @Override
    public Map<Integer,Student> getAllStudents() {
       return studentMap;

    }

    /**
     * This method to get student by id
     * @param id
     * @return Student
     */

    @Override
    public String getStudentById(Long id) {
        return "Student" + id;
    }

    /**
     * This method to Update the student
     * @param student
     * @return Student
     */

    @Override
    public String updateStudent(Student student) {
        studentMap.put(student.getStudentNumber(),student);
        return "updated student";

    }

    /**
     * This method to delete student by id
     * @param id
     * @return Student
     */

    @Override
    public String deleteStudent(Long id) {

        if(studentMap.containsKey(id)== false)
        {
            throw  new StudentNotFoundException("student with this student id does not exist");
        }
       return "student deleted"+id;
    }
}

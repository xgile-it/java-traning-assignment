package com.xgileit.learning.student.Service;

import com.xgileit.learning.student.model.Student;

/**
 * This is the class responsible for writing the business logic of the application
 * We defining the CRUD functions
 */
import java.util.Map;

public interface StudentService {

    Map<Integer,Student> getAllStudents();

    String getStudentById(Long id);

    String addStudent(Student student);

    String updateStudent(Student student);

    String deleteStudent(Long id);
}

package com.xgileit.learning.student.Controller;


import com.xgileit.learning.student.Service.impl.StudentServiceImpl;
import com.xgileit.learning.student.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

/**
 * This is the class responsible for processing incoming requests
 */

@RestController
@RequestMapping(value="/api/v1/student")
public class StudentController {

    StudentServiceImpl studentService = new StudentServiceImpl();
    ArrayList<String>studentList = new ArrayList<>();


    /**
     * This method to add or create a student
     * @param student
     * @return Student
     */
    @PostMapping(value= "/add")
    public String studentAdd(Student student)
    {
        return studentService.addStudent(student);

    }
    /**
     * This method to get  students by Id
     *  @param id
     */
    @GetMapping
    public String getStudentById(Long id)
    {
        return studentService.getStudentById(id);
    }

    /**
     * This method to get all student
     *
     */

    @GetMapping
    public Map<Integer,Student> getAllStudent()
    {
        return studentService.getAllStudents();
    }

    /**
     * This method to update the student
     *  @param student
     */

    @PutMapping
    public String studentUpdate(Student student)
    {
        return studentService.updateStudent(student);
    }
    /**
     * This method to delete the student
     *  @param id
     */


    @DeleteMapping
    public String studentDelete(Long id)
    {
        return studentService.deleteStudent(id);
    }

}

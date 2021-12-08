package com.student.crud.application.controller;

import com.student.crud.application.exception.MissingValueRequestException;
import com.student.crud.application.exception.StudentNotFound;
import com.student.crud.application.model.Student;
import com.student.crud.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * This is the class responsible for processing incoming requests
 */

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;

    }

    /**
     * This method to add a student
     * @param student
     * @return student
     */

    @PostMapping("/create")
    public ResponseEntity<Student> create(@RequestBody Student student) {

        if(student.getName().isEmpty() )
        {
            throw new MissingValueRequestException("missing required value");
        }

        return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.CREATED);

    }

    /**
     * This method to get all the students
     *
     */

    @GetMapping("/findAll")
    public ResponseEntity<List<Student>> find() {

        return new ResponseEntity<List<Student>>(studentService.fetchAllStudent(), HttpStatus.OK);
    }

    /**
     * This method to get  student by Id
     *  @param id
     */

    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id) {
        if (id <= 0) {
            throw new StudentNotFound("Invalid student id");
        }

        return studentService.fetchStudent(id);
    }

    /**
     * This method to update the students
     *  @param student
     */

    @PutMapping("/update")
    public ResponseEntity<Student> update(@RequestBody Student student) {

        return new ResponseEntity<Student>(studentService.updateStudent(student), HttpStatus.CREATED);

    }

    /**
     * This method to delete the student
     *  @param id
     */
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@PathVariable int id) {

        if (id <= 0) {
            throw new StudentNotFound("student with that id does not exist,can't delete student");
        }

        return new ResponseEntity<String>(studentService.deleteStudent(id), HttpStatus.ACCEPTED);


    }

}

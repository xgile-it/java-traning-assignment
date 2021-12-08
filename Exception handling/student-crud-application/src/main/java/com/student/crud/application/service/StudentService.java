package com.student.crud.application.service;

import com.student.crud.application.exception.StudentNotFound;
import com.student.crud.application.model.Student;
import com.student.crud.application.repository.StudentRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is the class responsible for writing the business logic of the application
 * We defining the CRUD functions
 */

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    @Autowired
    public StudentService (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student){

        return studentRepository.save(student);
    }

    public List<Student> fetchAllStudent(){
        return studentRepository.findAll();
    }

    public Student fetchStudent(int id){
        return studentRepository.findById(id).orElseThrow(()-> new StudentNotFound("student not found with id"+id));
    }

    public Student updateStudent(@NonNull Student student){

        Student selectedStudent = fetchStudent(student.getId());
        if(selectedStudent!= null && selectedStudent.getName()!=null){
            selectedStudent.setName(student.getName());
            selectedStudent.setEmail(student.getEmail());
            studentRepository.save(selectedStudent);
        }
        return student;
    }

    public String deleteStudent(@NonNull int id){
        studentRepository.deleteById(id);

        return "student deleted";
    }


}

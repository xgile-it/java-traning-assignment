package com.student.crud.application.repository;


import com.student.crud.application.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for performing all database operations on student entity
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}

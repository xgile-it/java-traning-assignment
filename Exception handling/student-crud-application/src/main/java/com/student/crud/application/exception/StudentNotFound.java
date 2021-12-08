package com.student.crud.application.exception;

public class StudentNotFound extends RuntimeException {

    public StudentNotFound(String message){
    super(message);
    }
}

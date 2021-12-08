package com.student.crud.application.exception;

public class MissingValueRequestException extends RuntimeException{

    public MissingValueRequestException(String message) {
        super(message);
    }
}

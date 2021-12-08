package com.student.crud.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

/**
 * This is a global exception class
 */

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<ErrorException> studentNotFound(StudentNotFound ex) {
        ErrorException response = new ErrorException();
        response.setStatus("NOT_FOUND");
        response.setMessage(ex.getMessage());
        response.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorException>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceAlreadyExists.class)
    public ResponseEntity<ErrorException> resourceAlreadyExists(ResourceAlreadyExists ex) {
        ErrorException response=new ErrorException();
        response.setStatus("CONFLICT");
        response.setMessage(ex.getMessage());
        response.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorException>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorException> customException(CustomException ex) {
        ErrorException response=new ErrorException();
        response.setStatus("BAD_REQUEST");
        response.setMessage(ex.getMessage());
        response.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorException>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorException> unauthorizedException(UnauthorizedException ex) {
        ErrorException response=new ErrorException();
        response.setStatus("UNAUTHORIZED");
        response.setMessage(ex.getMessage());
        response.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorException>(response, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(MissingValueRequestException.class)
    public ResponseEntity<ErrorException> missingFieldRequestException(MissingValueRequestException ex) {
        ErrorException response=new ErrorException();
        response.setStatus("BAD_REQUEST");
        response.setMessage(ex.getMessage());
        response.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorException>(response, HttpStatus.BAD_REQUEST);
    }








}

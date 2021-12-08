package com.student.crud.application.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorException {

    private String message;
    private String status;
    private LocalDateTime timeStamp;
}

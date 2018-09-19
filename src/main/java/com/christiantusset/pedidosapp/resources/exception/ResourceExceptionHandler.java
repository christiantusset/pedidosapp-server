package com.christiantusset.pedidosapp.resources.exception;

import com.christiantusset.pedidosapp.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> objectNotFound(ObjectNotFoundException exp, HttpServletRequest request) {

        StandarError err = new StandarError(HttpStatus.NOT_FOUND.value(), exp.getMessage(), System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}

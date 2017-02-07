package com.cacti.workshop.web;

import com.cacti.workshop.business.NotFoundException;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by domix on 2/3/17.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(NotFoundException.class)
  public HttpEntity notFound(NotFoundException exception) {
    return ResponseEntity.notFound().build();
  }
}

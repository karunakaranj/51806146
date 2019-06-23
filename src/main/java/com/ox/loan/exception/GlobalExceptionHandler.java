package com.ox.loan.exception;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	//This is for handling global exception
	
	  @ExceptionHandler(Exception.class) 
	  public ResponseEntity<ErrorResponse> globalExceptionHandler(Exception exception,WebRequest request) {
	  ErrorResponse errorResponse = new ErrorResponse();
	  errorResponse.setMessage(exception.getMessage());
	  return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	  
	  }
	 
	
	
	
	

}
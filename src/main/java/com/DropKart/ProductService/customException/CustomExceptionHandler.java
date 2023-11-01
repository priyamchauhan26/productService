package com.DropKart.ProductService.customException;
import com.DropKart.ProductService.dto.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MessageDto> handleProductNotFoundException(ProductNotFoundException ex){
		 MessageDto messageDto = new MessageDto();
		 messageDto.setStatus(400);
		 messageDto.setHttpstatus(HttpStatus.BAD_REQUEST);
		 messageDto.setMessage(ex.getMessage());
		 messageDto.setData(null);
		 return new ResponseEntity<>(messageDto, HttpStatus.BAD_REQUEST);
		 
	}
	
	@ExceptionHandler(InputDataNullException.class)
	public ResponseEntity<MessageDto> handleInputDataNullException(InputDataNullException ex){
		 MessageDto messageDto = new MessageDto();
		 messageDto.setStatus(400);
		 messageDto.setHttpstatus(HttpStatus.BAD_REQUEST);
		 messageDto.setMessage(ex.getMessage());
		 messageDto.setData(null);
		 return new ResponseEntity<>(messageDto, HttpStatus.BAD_REQUEST);
		 
	}
	
	

}

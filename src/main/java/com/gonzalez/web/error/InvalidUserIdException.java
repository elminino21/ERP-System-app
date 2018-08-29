package com.gonzalez.web.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="user not found")
public class InvalidUserIdException extends RuntimeException{

}

package com.gonzalez.web.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason="item alreay exits")
public class InvalidItemNumberException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5412534478243108631L;

}

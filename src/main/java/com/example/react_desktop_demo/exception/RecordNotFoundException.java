package com.example.react_desktop_demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1148952080066704162L;

	public RecordNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecordNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RecordNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RecordNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RecordNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}

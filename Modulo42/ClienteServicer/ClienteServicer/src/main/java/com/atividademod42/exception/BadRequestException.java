package com.atividademod42.exception;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 355483783274157280L;
	
	public BadRequestException(String message) {
        super(message);
    }
}

package com.nelioalves.cursomc.services.exceptions;

import org.springframework.boot.autoconfigure.web.ErrorProperties.Whitelabel;

public class DataIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg,cause);
	}
}

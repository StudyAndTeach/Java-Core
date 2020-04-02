package com.study_teach.main.Exceptions;

public class OutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;
	String message;
	
	public OutOfRangeException(String msg) {
		
		message = msg;
		
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
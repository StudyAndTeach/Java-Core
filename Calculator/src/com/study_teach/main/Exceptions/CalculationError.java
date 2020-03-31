package com.study_teach.main.Exceptions;

public class CalculationError extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	
	

	public CalculationError(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}

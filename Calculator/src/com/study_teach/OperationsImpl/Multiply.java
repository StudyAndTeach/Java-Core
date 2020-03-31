package com.study_teach.OperationsImpl;

import com.study_teach.Operations.Calculation;
import com.study_teach.main.Exceptions.CalculationError;

public class Multiply implements Calculation {
	
	@Override
	public double calculate(double i, double j) throws CalculationError {
		return i*j;
	}
}

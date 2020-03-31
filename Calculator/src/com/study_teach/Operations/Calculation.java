package com.study_teach.Operations;

import com.study_teach.main.Exceptions.CalculationError;

public interface Calculation {

	public double calculate(double i, double j) throws CalculationError;

}

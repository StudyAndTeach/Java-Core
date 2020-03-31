package com.study_teach.OperationsImpl;

import com.study_teach.Constants.CalculatorConstants;
import com.study_teach.Operations.Calculation;
import com.study_teach.main.Exceptions.CalculationError;

public class Divide implements Calculation,CalculatorConstants {

	@Override
	public double calculate(double i,double j) throws CalculationError {
		double result = 0 ;
		try {
			result = i / j;
		}
		catch(ArithmeticException e) {
			throw new CalculationError(ARITHMATIC_EXCEPTION);
		}
		return result;
	}

}

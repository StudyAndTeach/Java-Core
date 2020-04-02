package com.study_teach.OperationsImpl;

import com.study_teach.Constants.CalculatorConstants;
import com.study_teach.Operations.Calculation;
import com.study_teach.Utils.Utilities;
import com.study_teach.main.Exceptions.CalculationError;
import com.study_teach.main.Exceptions.OutOfRangeException;

public class Divide implements Calculation,CalculatorConstants {

	
	@Override
	public Number doCalculation() throws CalculationError {
		String[] readInput = Utilities.readInput();
		Number result = null;
		try {
				Utilities.isInRange(readInput);
				
				String s[] = readInput[0].split(".");
				if( s.length == 1 ) {
					int val1 = Integer.parseInt(readInput[0]);
					s = readInput[1].split(".");
					if(s.length == 1)
					{
						int val2 = Integer.parseInt(readInput[1]);
						result = calculate(val1,val2);
					}
					else {
						double val2 = Double.parseDouble(readInput[1]);
						result = calculate(val1,val2);
					}
				}else {
					double val1 = Double.parseDouble(readInput[0]);
					s = readInput[1].split(".");
					if(s.length == 1)
					{
						int val2 = Integer.parseInt(readInput[1]);
						result = calculate(val1,val2);
					}
					else {
						double val2 = Double.parseDouble(readInput[1]);
						result = calculate(val1,val2);
					}
				}
		}catch (NumberFormatException e) {
			throw new CalculationError(NUMBER_FORMAT_EXCPETION);
		}catch(OutOfRangeException e) {
			throw new CalculationError(e.getMessage());
		}
			
		return result;
	}
	
	public Number calculate(double i,double j) throws CalculationError {
		double result = 0 ;
		try {
			if(j!=0)
				result = i / j;
			else
				throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			throw new CalculationError(ARITHMATIC_EXCEPTION);
		}
		return result;
	}
	
	public Number calculate(int i,int j) throws CalculationError {
		double result = 0 ;
		try {
			if(j!=0)
				result = i / j;
			else
				throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			throw new CalculationError(ARITHMATIC_EXCEPTION);
		}
		return result;
	}
	
	public Number calculate(int i,double j) throws CalculationError {
		double result = 0 ;
		try {
			if(j!=0)
				result = i / j;
			else
				throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			throw new CalculationError(ARITHMATIC_EXCEPTION);
		}
		return result;
	}
	
	public Number calculate(double i,int j) throws CalculationError {
		double result = 0 ;
		try {
			if(j!=0)
				result = i / j;
			else
				throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			throw new CalculationError(ARITHMATIC_EXCEPTION);
		}
		return result;
	}
	

}

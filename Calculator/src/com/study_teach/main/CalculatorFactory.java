package com.study_teach.main;

import com.study_teach.Constants.CalculatorConstants;
import com.study_teach.Operations.Calculation;
import com.study_teach.OperationsImpl.Add;
import com.study_teach.OperationsImpl.Divide;
import com.study_teach.OperationsImpl.Multiply;
import com.study_teach.OperationsImpl.Subtract;

public class CalculatorFactory implements CalculatorConstants {
	
	public static Calculation getOperator(String type) {
		Calculation object= null;
		
		if(type.toUpperCase().equals(ADD)) {
			object = new Add();
		}
		
		else if(type.toUpperCase().equals(SUBTRACT)) {
			object = new Subtract();
		}
		
		else if(type.toUpperCase().equals(MULTIPLY)) {
			object = new Multiply();	
		}
		
		else if(type.toUpperCase().equals(DIVIDE)) {
			object = new Divide();
		}
		
		return object;
	}

}

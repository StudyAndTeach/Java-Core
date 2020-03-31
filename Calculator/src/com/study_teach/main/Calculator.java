package com.study_teach.main;

import java.util.Scanner;

import com.study_teach.Constants.CalculatorConstants;
import com.study_teach.Operations.Calculation;
import com.study_teach.OperationsImpl.Add;
import com.study_teach.OperationsImpl.Divide;
import com.study_teach.OperationsImpl.Multiply;
import com.study_teach.OperationsImpl.Subtract;
import com.study_teach.Utils.Utilities;
import com.study_teach.main.Exceptions.CalculationError;

public class Calculator implements CalculatorConstants {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		invalid_option:
		while(true) {
			Utilities.menu();
			
			String arg1 = sc.next();
			String arg2 = sc.next();
			String option = sc.next();
			double val1 =0;
			double val2 =0;
			try {
				val1 = Double.parseDouble(arg1);
				val2 = Double.parseDouble(arg2);
			}catch(NumberFormatException e) {
				System.out.println(NUMBER_FORMAT_EXCPETION);
			}catch(Exception e) {
				System.out.println(UNKNOWN_ERROR);
			}
			
	
			Calculation calculationObject = Utilities.chooseOptions(option);
			
			if(calculationObject == null && option.equals("5"))
				break;
			if(calculationObject == null)
				continue invalid_option;
			
			if(!Utilities.isInRange(val1) && !Utilities.isInRange(val2))
			{
				System.out.println(ALLOWED_RANGE);
				continue invalid_option;
			}
			
			try {
				
				double result=0;
				if(calculationObject instanceof Add)
					result = ((Add)calculationObject).calculate(val1,val2);
				
				else if(calculationObject instanceof Subtract)
					result = ((Subtract)calculationObject).calculate(val1,val2);
				
				else if(calculationObject instanceof Multiply)
					result = ((Multiply)calculationObject).calculate(val1,val2);
				
				else if(calculationObject instanceof Divide)
					result = ((Divide)calculationObject).calculate(val1,val2);
				
				System.out.println("The result is "+ Math.floor(result) +" "+result 
				+" "+( result == Math.floor(result) ? (343) : result));
				System.out.println("The result is again "+(result == Math.floor(result)));

			}catch (CalculationError e) {
				System.out.print(e.getMessage());
			}
			
			
		}
	sc.close();
		
	}

}

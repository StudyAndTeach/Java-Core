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
			String option = sc.next();
		
			Calculation calculationObject = Utilities.chooseOptions(option);
			
			if(calculationObject == null && option.equals("5"))
				break;
			if(calculationObject == null && !option.equals("5"))
				continue invalid_option;
			
			
			try {
				
				Number result=0;
				if(calculationObject instanceof Add)
					result = ((Add)calculationObject).doCalculation();
				
				else if(calculationObject instanceof Subtract)
					result = ((Subtract)calculationObject).doCalculation();
				
				else if(calculationObject instanceof Multiply)
					result = ((Multiply)calculationObject).doCalculation();
				
				else if(calculationObject instanceof Divide)
					result = ((Divide)calculationObject).doCalculation();
					
				System.out.println("The result is "+ result);
				//System.out.println("The result is again "+(result == Math.floor(result)));
				
				
			}catch (CalculationError e) {
				System.out.print(e.getMessage()+"\n");
				continue invalid_option ;
			}
			
			
		}
		sc.close();
		
		
	}

}

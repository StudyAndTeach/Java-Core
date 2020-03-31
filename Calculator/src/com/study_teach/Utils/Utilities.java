package com.study_teach.Utils;

import com.study_teach.Constants.CalculatorConstants;
import com.study_teach.Operations.Calculation;
import com.study_teach.main.CalculatorFactory;

public class Utilities implements CalculatorConstants {

	public static void menu() {
		System.out.println("/t/t1. " + ADD);
		System.out.println("/t/t2. " + SUBTRACT);
		System.out.println("/t/t3. " + MULTIPLY);
		System.out.println("/t/t4. " + DIVIDE);
		System.out.println("/t/t5. EXIT");
	}

	public static Calculation chooseOptions(String option) {

		Calculation calculationObject = null;

		switch (option) {

		case "1":
			calculationObject = CalculatorFactory.getOperator(ADD);
			break;

		case "2":
			calculationObject = CalculatorFactory.getOperator(SUBTRACT);
			break;

		case "3":
			calculationObject = CalculatorFactory.getOperator(MULTIPLY);
			break;

		case "4":
			calculationObject = CalculatorFactory.getOperator(DIVIDE);
			break;

		case "5":
			break;

		default:
			System.out.println("Invalid Input");
		}

		return calculationObject;

	}

	public static boolean checkIfInt(Double argument) {
		return argument == Math.floor(argument);
	}

	public static boolean isInRange(Double argument) {
		return argument < Integer.MAX_VALUE && argument > Integer.MIN_VALUE;
	}
}

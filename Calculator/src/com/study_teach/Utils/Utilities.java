package com.study_teach.Utils;

import java.util.Scanner;

import com.study_teach.Constants.CalculatorConstants;
import com.study_teach.main.Exceptions.OutOfRangeException;
import com.study_teach.Operations.Calculation;
import com.study_teach.main.CalculatorFactory;

public class Utilities implements CalculatorConstants {

	public static void menu() {
		System.out.println("\t\t1. " + ADD);
		System.out.println("\t\t2. " + SUBTRACT);
		System.out.println("\t\t3. " + MULTIPLY);
		System.out.println("\t\t4. " + DIVIDE);
		System.out.println("\t\t5. EXIT");
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

	public static void isInRange(String arg[]) throws NumberFormatException,OutOfRangeException {

		double argument = Double.parseDouble(arg[0]);
		double argument1 = Double.parseDouble(arg[1]);

		if ((argument < Integer.MAX_VALUE && argument > Integer.MIN_VALUE)
				&& (argument1 < Integer.MAX_VALUE && argument1 > Integer.MIN_VALUE))
			return;
		else
			throw new OutOfRangeException(ALLOWED_RANGE);
	}

	public static String[] readInput() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first argument");
		String a = sc.next();
		System.out.println("Enter the second argument");
		String b = sc.next();
		return new String[] { a, b };

	}
}

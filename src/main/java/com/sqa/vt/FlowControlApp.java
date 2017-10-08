/**
 * File Name: FlowControlApp.java<br>
 * Vitaliy Hudz<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 7, 2017
 */
package com.sqa.vt;

import java.util.*;

import com.sqa.vt.helpers.*;

/**
 * FlowControlApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Vitaliy Hudz
 * @version 1.0.0
 * @since 1.0
 */
public class FlowControlApp {

	private static String appName = "Flow Control App";

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		evalNumberAgainst10();
		determineMonthBasedOnInt();
		evalGrade();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 * Write a program that prints the name of month using switch statement
	 * given a number from the user. You will need to use the Integer.parseInt()
	 * method to convert a user supplied string to a number type variable that
	 * can be evaluated.
	 */
	private static void determineMonthBasedOnInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the month: ");
		String input = scanner.nextLine();
		switch (Integer.parseInt(input)) {
		case 1:
			System.out.println("Its January");
			break;
		case 2:
			System.out.println("Its February");
			break;
		case 3:
			System.out.println("Its March");
			break;
		case 4:
			System.out.println("Its April");
			break;
		case 5:
			System.out.println("Its May");
			break;
		case 6:
			System.out.println("Its June");
			break;
		case 7:
			System.out.println("Its July");
			break;
		case 8:
			System.out.println("Its August");
			break;
		case 9:
			System.out.println("Its September");
			break;
		case 10:
			System.out.println("Its October");
			break;
		case 11:
			System.out.println("Its November");
			break;
		case 12:
			System.out.println("Its December");
			break;
		default:
			System.out.println("Sorry!!");
			break;
		}
	}

	/**
	 * Write a program that can ask the user for a grade value and print the
	 * associated grade letter.
	 */
	private static void evalGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a Grade you have:");
		String noOfGrades = scanner.nextLine();
		int total = 0, grade;
		for (int i = 1; i <= Integer.parseInt(noOfGrades); i++) {
			System.out.println("Please enter subject " + i + " marks:");
			String subject = scanner.nextLine();
			total = total + Integer.parseInt(subject);
		}
		grade = total / Integer.parseInt(noOfGrades);
		System.out.println("You got " + grade + ".");
	}

	/**
	 * Write a function which takes a int parameter and print the message on
	 * screen that “number is greater than 10” otherwise it should print “number
	 * is smaller than 10” (Can you support if parameter is equal to 10)
	 */
	private static void evalNumberAgainst10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to evaluate against 10:");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		if (number > 10) {
			System.out.println("Number " + number + " is greater then 10");
		} else if (number < 10) {
			System.out.println("Number " + number + " is smaller then 10");
		} else if (number == 10) {
			System.out.println("Number " + number + " equals 10");
		} else {
			System.out.println("Value entered is incorrect. Value entered: " + number);
		}
	}
}

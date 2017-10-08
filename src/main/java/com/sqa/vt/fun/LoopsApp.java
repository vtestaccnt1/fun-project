/**
 * File Name: LoopsApp.java<br>
 * Vitaliy Hudz<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 7, 2017
 */
package com.sqa.vt.fun;

import com.sqa.vt.helpers.*;

/**
 * LoopsApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Vitaliy Hudz
 * @version 1.0.0
 * @since 1.0
 */
public class LoopsApp {

	private static String appName = "Fun with Loops";

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		doForLoopExercise();
		doWhileLoopExercise();
		doEvalGradeAverage();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 * Write a method which prints the grade average for a user based on a user
	 * supplied set of grade values. Repeat execution until user has no more
	 * items to be graded. Use a do while for this exercise. You will also have
	 * to use two variables to hold the current accumulated grade points as well
	 * as the total number of grades entered so that the average will be
	 * totalGradePoints / numTotalGrades. Other things covered in this exercise:
	 * Scanner, Integer.parseInt.
	 */
	private static void doEvalGradeAverage() {
		// TODO Auto-generated method stub
	}

	/**
	 * Write a Java program which prints out a count from 1 to 100, than prints
	 * the numbers 200-100, and finally prints 10-1000 with only numbers evenly
	 * divided by 10. Use the for loop to do these and do not use the %
	 * operator.
	 */
	private static void doForLoopExercise() {
		System.out.println("Print 1-100:");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if (i < 100) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
		System.out.println("Print 200-100:");
		for (int i = 200; i >= 100; i--) {
			System.out.print(i);
			if (i > 100) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
		System.out.println("Print 10-1000, div by 10");
		for (int i = 10; i <= 1000; i += 10) {
			System.out.print(i);
			if (i < 1000) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
		int userNum = AppBasics.requestInt("What number do you want to count to?", 2, 300);
		System.out.println("Print 1 - ?");
		for (int i = 1; i <= userNum; i += 1) {
			System.out.print(i);
			if (i < userNum) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
	}

	/**
	 * Write a Java program which prints all even number from 1 to 100, then all
	 * odd numbers between 300-400, and finally prints 30-333 with only numbers
	 * evenly divided by 3 . Use a while loop for this exercise. You will also
	 * want to use an if condition and use the % operator to check if a number %
	 * 2 is equal to 0 and print it if that is the case.
	 */
	private static void doWhileLoopExercise() {
		System.out.println("Print 1-100:");
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i);
				if (i < 100) {
					System.out.print(", ");
				}
			}
			i++;
		}
		System.out.println("\n");
		System.out.println("Print 300-400:");
		int j = 300;
		while (j <= 400) {
			if (j % 2 != 0) {
				System.out.print(j);
				if (j < 399) {
					System.out.print(", ");
				}
			}
			j++;
		}
		System.out.println("\n");
		System.out.println("Print 30-333:");
		int q = 30;
		while (q <= 333) {
			if (q % 3 == 0) {
				System.out.print(q);
				if (q < 333) {
					System.out.print(", ");
				}
			}
			q++;
		}
		System.out.println("\n");
	}
}
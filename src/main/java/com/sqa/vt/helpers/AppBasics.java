/**
 * File Name: AppBasics.java<br>
 * Vitaliy Hudz<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 7, 2017
 */
package com.sqa.vt.helpers;

import java.util.*;

import com.sqa.vt.helpers.exceptions.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Vitaliy Hudz
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells the user at the end of an application to
	 * say Thank you and wish them well.
	 *
	 * @param name
	 *            Name of user
	 * @param appName
	 *            Name of the Application
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println("\nThank you " + name + ", for using the " + appName + " Application.\nHave a great Day!");
	}

	/**
	 * Helper method which greets the user and welcomes them to the Application.
	 * This method then takes their name and returns it to the calling method.
	 *
	 * @param appName
	 *            The name of the Application
	 * @return name The assigned name of User.
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could i get your name please? ");
		String name = scanner.nextLine();
		return scanner.nextLine();
	}

	/**
	 * @param string
	 * @return
	 */
	public static int requestInt(String question, int min, int max) {
		int resultNum = 0;
		String input = "";
		boolean valid = false;
		while (!valid) {
			try {
				// Ask Question
				System.out.print(question + " ");
				// Get input string from user
				input = scanner.nextLine();
				// Parse input String into int type
				resultNum = Integer.parseInt(input);
				// TODO Evaluate valid range?
				if (resultNum < min) {
					throw new RequestNumberUnderMinException();
				}
				if (resultNum > max) {
					throw new RequestNumberOverMaxException();
				}
				// TODO Evaluate valid entry
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a valid formatted number. You entered: " + input + ".");
				/*
				 * } catch (RequestNumberUnderMinException e) { System.out.
				 * println("You have entered a number below minimum. Minimum number is: "
				 * + min + ". You entered: " + input + "."); } catch
				 * (RequestNumberOverMaxException e) { System.out.
				 * println("You have entered a number above maximum. Maximum number is: "
				 * + max + ". You entered: " + input + "."); }
				 */
			} catch (RequestNumberNotWithinRangeException e) {
				System.out.println("You have not entered a valid number within range: " + min + " to " + max
						+ ". You entered: " + input + ".");
			}
		}
		return resultNum;
	}
}

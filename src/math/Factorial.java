package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		/*
		 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120. Write a java program to
		 * find Factorial of a given number using Recursion as well as
		 * Iteration.
		 *
		 */

		// Recursion
		int fact = 1;
		int number = 5;
		fact = factorial(number);

		// Iteration
		int i, fact2 = 1;
		int number2 = 5;
		for (i = 1; i <= number2; i++) {
			fact2 = fact2 * i;
		}
		System.out.println("Factorial of " + number2 + " is:  " + fact2);

	}

}

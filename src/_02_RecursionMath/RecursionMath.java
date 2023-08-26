package _02_RecursionMath;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// If times is 1
		// Return number
		if (times == 1) {
			return number;
		} else {
			// Else return number + recursiveMultiplication(number, times-1)

			return number + recursiveMultiplication(number, times - 1);
		}
	}

	// Try this one on your own!
	// Hint: if numberToDivideBy is bigger than number,
	// you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (number == 0) {
			return number;
		} else if (number < 0) {
			return recursiveDivision(-number, numberToDivideBy);
		} else if (numberToDivideBy < 0) {
			return recursiveDivision(number / numberToDivideBy, numberToDivideBy);
		} else {
			return number / numberToDivideBy;
		}
	}

	// Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 1) {
			return number;
		} else {

			return number * recursiveMultiplication(number, power - 1);

		}
	}
}

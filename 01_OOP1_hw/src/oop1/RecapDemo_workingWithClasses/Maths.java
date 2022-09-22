package oop1.RecapDemo_workingWithClasses;

public class Maths {

	public int Sum(int number1, int number2) {
		return number1 + number2;
	}

	public int Sub(int number1, int number2) {
		return number1 - number2;
	}

	public int Multi(int number1, int number2) {
		return number1 * number2;
	}

	public double Div(int number1, int number2) {
		if (number2 != 0)
			return number1 / number2;
		return number2;
	}

}

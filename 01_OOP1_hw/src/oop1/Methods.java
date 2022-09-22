package oop1;

public class Methods {

	public static void main(String[] args) {
		
		info();
		int sum = sum(2,7);
		System.out.println(sum);
		int sum2 = sumAll(2,3,5,8,13);
		System.out.println(sum2);
		
	}
	
	// no arguments - no return
	public static void info() {
		System.out.println("Data: ...\n");
	}
	
	// return an int type value
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	/*
	 * Variable Arguments: not seting a spesific argument "count" for a method
	 */
	public static int sumAll(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}

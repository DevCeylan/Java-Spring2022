
public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 11;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("not prime");
			return;
		}
		else if (number < 1) {
			System.out.println("invalid number");
			return;
		}
		else {
			for(int i=2; i<number; i++)
				if(number % i == 0)
					isPrime = false;
		}
		
		if(isPrime) {
			System.out.println("Number " + number +" is a prime number");
		}
		else {
			System.out.println("Number " + number +" is NOT a prime number");
		}

	}

}

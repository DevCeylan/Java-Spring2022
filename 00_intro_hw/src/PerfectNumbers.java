
public class PerfectNumbers {

	public static void main(String[] args) {
		
		int number = 8128;
		int total = 0;
		
		for(int i=1; i<number; i++)
			if(number % i == 0)
				total += i;
		
		if (total == number) {
			System.out.println(number + " is a Perfect Number");
		}
		else {
			System.out.println(number + " is NOT a Perfect Number");
		}

	}

}


public class FindNumber {

	public static void main(String[] args) {
		
		int[] numbers = {2,4,6,8,9};
		int search = 10;
		
		for (int number : numbers) {
			if(number == search) {
				System.out.println("'" + search + "'" + " found");
				return;
			}
		}
		System.out.println("Not found.");

	}

}

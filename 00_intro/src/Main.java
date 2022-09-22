import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
		
		String randomString = "random string variable";
		System.out.println(randomString);
		
		int value = 11;
		double rate = 11.13;
		System.out.println(value + rate);
		
		boolean flag = true; // false
		
		if (flag) {
			System.out.println("First condition");
		} else if(!(flag)) {
			System.out.println("Other condition");
		}
		else {
			System.out.println("Anything ELSE");
		}
		
		// array : dataType[] arrayName = {...};
		
		String[] firstArray = {"element1","element2","e3"};
		
		// loop : for / foreach
		
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
		
	}

}
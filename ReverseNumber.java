package reverse;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 12345; // Initialize the number to a specific value

		int reversedNumber = 0;
		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		System.out.println("Original number: 12345");
		System.out.println("Reversed number: " + reversedNumber);

	}

}

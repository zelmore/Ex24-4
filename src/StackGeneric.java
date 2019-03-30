// Ex24-4
// Zachary Elmore
// 12/5/16
// Program that lists the first 50 prime numbers in descending order

public class StackGeneric {

	public static void main(String[] args) {
		// Create a GenericStack
		GenericStack<Integer> stack = new GenericStack<Integer>();
		int prime = 50; // Number of prime numbers
		int count = 0;
		for (int i = 2; count < prime; i++) { // Loop for finding prime numbers
			if (isPrime(i)) {
				stack.push(i);
				count++;
			}
		}

		// Display the numbers in the stack
		System.out.println("The first 50 prime numbers in descending order: ");
		for (int i = 1; !stack.isEmpty(); i++){
			if (i % 10 == 0)
				System.out.printf("%3d\n", stack.pop());
			else
				System.out.printf("%3d ", stack.pop());
		}
		System.out.println();
	}

	/** Return true if n is a prime number, Otherwise return false */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

public class PowerOfThree {
	public static boolean isPowerOfThree(int number) {
		var current = 1; // initialize the counter, start with 1 since we're multiplying numbers here
		while (current <= number) { // using while loop so that the statement will run until the condition is proved false
			if (current == number) {
				return true;
			}
			current *= 3; // if the condition is proved false, we'll multiply the counter by 3 and try again
		}
		return false;
	}

	public static void main(String[] args) { 
		int example1 = 8;
		int example2 = 9;
		System.out.println(PowerOfThree.isPowerOfThree(example1)); // should be false
		System.out.println(PowerOfThree.isPowerOfThree(example2)); // should be true
	}
}

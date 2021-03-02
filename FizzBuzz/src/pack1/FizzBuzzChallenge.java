package pack1;

public class FizzBuzzChallenge {

	public static void main(String[] args) {
		FizzBuzzOutput(100); // to a specified limit (e.g. 100).
	}

	public static void FizzBuzzOutput(int n) {

		for (int i = 0; i < n; i++) {
			if ((i % 3 == 0 && i % 5 == 0)) {
				System.out.println("FizzBuzz"); // 3. For multiples of 3 and 5 return "FizzBuzz"

			} else if (i % 3 == 0) {
				System.out.println("Fizz"); // 1. For multiples of 3 return "Fizz"

			} else if (i % 5 == 0) {
				System.out.println("Buzz"); // 2. For multiples of 5 return "Buzz"
			} else {
				System.out.println(i); // 4. If none of the other rules apply, return the number itself
			}
		}
	}

}
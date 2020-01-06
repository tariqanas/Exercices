import java.util.Arrays;

public class ClosestDistance {

	// Returns the distance between the two closest numbers.
	static int distClosestNumbers(int[] numbers) {

		Arrays.sort(numbers);
		int smallestDistance = numbers[numbers.length - 1];
		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] - numbers[i - 1] < smallestDistance) {
				smallestDistance = numbers[i] - numbers[i - 1];
			}

		}
		
		return smallestDistance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] testArray = { 3, 50, -200, 203, 98, 65 };
		int result = distClosestNumbers(testArray);
		System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)

	}

}

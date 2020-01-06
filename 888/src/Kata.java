import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

	public static String createPhoneNumber(int[] numbers) {
		// Your code here!
		
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
		
		
//		if (numbers.length > 10) {
//			return null;
//		}
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < numbers.length; i++) {
//
//			if (numbers[i] < 0 || numbers[i] > 9) {
//				return null;
//			}
//
//			sb.append(numbers[i]);
//		}
//
//		/**Phone Configuration **/
//		sb.insert(0, '(');
//		sb.insert(4, ')');
//		sb.insert(5, ' ');
//		sb.insert(9, '-');
//		/** End **/
//		
//		 
//		return new String(sb);
	}

	public static void main(String[] args) {

		int[] ar = { 0, 6, 4, 9, 8, 5, 3, 6, 0, 1};
		System.out.println(createPhoneNumber(ar));
	}
}
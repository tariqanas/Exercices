import java.util.stream.IntStream;

public class Alphabet {

	final static char[] tabs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	final static char[] tabsM = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static char whatsMissing(final char[] alpha) {

		char missingX = '0';
		if (alpha.length < 2)
			return '0';

		int begin = IntStream.range(0, tabs.length).filter(i -> tabs[i] == alpha[0] || tabsM[i] == alpha[0]).findFirst()
				.orElse(-1);

		int end = IntStream.range(0, tabs.length)
				.filter(i -> tabs[i] == alpha[alpha.length - 1] || tabsM[i] == alpha[alpha.length - 1]).findFirst()
				.orElse(-1);

		for (int i = begin; i < end; i++) {

			for (char e : alpha) {
				if (tabs[i] == e) {
					continue;
				} else {
					missingX = tabsM[i];
				}
			}
		}
		return missingX;
	}

	public static void main(String[] args) {

		/** Should return B */
		System.out.println("The missing letter is : " + whatsMissing(new char[] { 'A', 'C' }));

	}

}

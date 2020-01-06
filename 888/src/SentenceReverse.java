
public class SentenceReverse {

	public static String reverser(String sentence) {

		String[] reversed = sentence.split("\\s");
		StringBuilder bs = new StringBuilder();

		for (int i = reversed.length - 1; i >= 0; i--) {
			bs.append(reversed[i] + " ");

		}

		return new String(bs);

	}

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(reverser("Java Dev , France "));
	 	
	}

}

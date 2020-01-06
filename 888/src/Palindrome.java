
public class Palindrome {

	
	
	
	public static boolean isPalindromeV1(String chaine) {
		
		 
		for ( int i = 0 ; i < chaine.length() ; i++ ) {
			for( int j = chaine.length() -1 ; i<j ; j--) {
				  if ( chaine.charAt(i) != chaine.charAt(j)) {
					return false;
				}
				  i++; 
			}
	}
		return true;
	}
	
	public static boolean isPalindromeV2(String chaine) {
		
		StringBuffer bt = new StringBuffer();
		 String envers ;
		for( int i = 0 ; i < chaine.length() ; i++ ) {
			 bt.append(chaine.charAt(chaine.length()-1 -i));
		}
		envers = new String(bt);
		
		return chaine.equalsIgnoreCase(envers);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("ABBA - Palindrome: " + isPalindromeV1("ABBA"));
		 System.out.println("ANAS - Palindrome: " + isPalindromeV1("ANAS"));
		 System.out.println("BMW  - Palindrome: " + isPalindromeV1("BMW"));
		 System.out.println("STS  - Palindrome: " + isPalindromeV1("STS"));
		 
		 System.out.println("---------------------V2------------------");
		 
		 System.out.println("ABBA - Palindrome: " + isPalindromeV2("ABBA"));
		 System.out.println("ANAS - Palindrome: " + isPalindromeV2("ANAS"));
		 System.out.println("BMW  - Palindrome: " + isPalindromeV2("BMW"));
		 System.out.println("STS  - Palindrome: " + isPalindromeV2("STS"));
		  

	}

}

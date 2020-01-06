import java.util.Scanner;

public class factorielle {

	
	public static int factoriellee(int nombre) throws NumberFormatException {
		
		int resultat = 1;
		if(nombre == 0 ) 
			return 1;
		
		for( int i = 1 ; i<=nombre;i++) {
			resultat *=i;
		}
		
		return resultat;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Introduire le numéro : ");
		int number = userinput.nextInt();
		System.out.println("Voilà le resultat :  " + factoriellee(number)); 
	}

}

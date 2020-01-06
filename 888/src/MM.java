import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MM {

	
	class person {
		private String firstName;
		private String lastName;
		
		 String getfirstName( ) {
			return this.firstName;
		}
		 String getLastName() {
			 return this.lastName;
		 }
	}
	public static void main(String[] args) {
		
		
		List<String> tabs =  Arrays.asList("Anas","Anas0","Mehdi","France" );
		
		MM t = new MM();
		person p = t.new person();
		
		p.firstName = "TARIQ";
		p.lastName = "TARIQ";
		
		person p2= t.new person();
		
		p2.firstName = "SAAD";
		p2.lastName = "tariq";
		
		
		Comparator<person> compare = Comparator.comparing(k -> k.getLastName());
		
		System.out.println(compare.compare(p, p2));
		
	}

}

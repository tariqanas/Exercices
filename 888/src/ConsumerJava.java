import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerJava {
	
	
	 public static void acceptAllEmployee(List<Student> student, Consumer<Student> printer) {
	      for (Student e : student) {
	         printer.accept(e);
	      }
	   }

	 
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
		            new Student("John", 3),
		            new Student("Mark", 4)
		      );

		  
		      
		   acceptAllEmployee(students,e -> System.out.println(e.name));
		   
		  
		   acceptAllEmployee(students, e-> {
			   e.gpa = e.gpa*500;
			   System.out.println(e.gpa);
			   });
		   }

		  
		}


		class Student {
		  public String name;
		  public double gpa;

		  Student(String name, double g) {
		    this.name = name;
		    this.gpa = g;
		  }
		}
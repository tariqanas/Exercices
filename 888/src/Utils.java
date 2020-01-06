import java.util.Arrays;
import  java.util.stream.*;
public class Utils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] dt = {1,2,5,4};
		  Arrays.stream(dt).map(Integer::valueOf).takeWhile(l -> l != 0).sum();
		 IntStream.of(dt).takeWhile(l -> l !=0).sum();
		 
	}

}

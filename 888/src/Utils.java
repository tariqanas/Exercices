import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] dt = {1,2,5,4};
		  Arrays.stream(dt).map(Integer::valueOf).takeWhile(l -> l != 0).sum();
		 IntStream.of(dt).takeWhile(l -> l !=0).sum();
		 
		 
		 //**Understand Well the difference between Map & FlatMap */
		 List<Integer> ls = List.of(1,2,3,4,5);
		 List<Integer> ls2 = List.of(6,7,8,9);
		 List<List<Integer>> ls3 = List.of(ls,ls2);
		 List<Integer> ls4 = ls3.stream().
				 flatMap(x -> x.stream()).
				 sorted().
				 map(y -> y*2).
				 collect(Collectors.toList());
		 
		 //Done.
		 
		 System.out.println(ls4);
		 
		
		 
		 Map<String,Integer> mappy = new TreeMap<String, Integer>();
		 mappy.put("FName", 1);
		 mappy.put("LName", 2);
		 mappy.put("AGE", 3);
		 
		 for(Entry<String,Integer> x : mappy.entrySet()) {
			 System.out.println(x.getKey() + " :" + x.getValue());
		 }
		 
	}

}

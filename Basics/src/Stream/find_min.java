/**
 * 
 */
package Stream;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author kailash
 *
 */
public class find_min {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = Arrays.asList(8,6,4,12,18,-8,56,49);
		Integer var = list.stream().min(Integer::compare).get();
		System.out.println(var);
		
		Integer max_var= list.stream().max(Integer::compare).get();
		System.out.println(max_var);
		System.out.println("Sort the array");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println();
		
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
				
	}	
}
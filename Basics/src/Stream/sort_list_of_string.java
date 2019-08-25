package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
sorting the elements of array based
on their last character
*/

public class sort_list_of_string {
	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("Geeks", "for",
                 "GeeksforGeeks", "GeeksQuiz", "GFG");
		 
		 list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 System.out.println();
		 list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		 
		 /*
		  * sorting the elements of array based
			on their last character
		  */
		 
		 String[] array = { "GFG", "Geeks", "for","GeeksforGeeks", "GeeksQuiz" };
		 System.out.println("\nThe sorted stream is :");
		
		 Stream.of(array).sorted((str1,str2)->
		 			Character.compare(str1.charAt(str1.length()-1),
		 					str2.charAt(str2.length()-1))).forEach(System.out::println);
		 
		 
 	 


		 
	}

}

package strings_demo;

import java.util.Arrays;

public class int_array_to_string_array {
	public static void main(String[] args) {
		int[] nums = {5,1,2,11,3}; //List or Vector
		for(int ii:nums){
			System.out.println("\""+ii+"\"");		
		}
		System.out.print("\"Hello\"");
	}
}

/*
  
int[] nums = {-5,1,2,11,3};
Arrays.sort(nums);
String[] a=Arrays.toString(nums).split("[\\[\\]]")[1].split(", "); 
System.out.println(Arrays.toString(a)); 

 */
 
 
 

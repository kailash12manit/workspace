package DBS_hack2Hire_01JUNE2019;

import java.util.ArrayList;

public class Arraylist_demo {
	public static void main(String[] args) {
		
		ArrayList<?> intList = new ArrayList<Integer>();
		//intList.add(new Integer(10)); // Error in this line
		System.out.println(intList);
		
	}
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
The method add(capture#1-of ?) in the type ArrayList<capture#1-of ?> is not applicable
 for the arguments (Integer)

at DBS_hack2Hire_01JUNE2019.Arraylist_demo.main(Arraylist_demo.java:9)

*/
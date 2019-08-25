package DBS_hack2Hire_01JUNE2019;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_add_reverse {
	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(3);
		Collections.sort(al);
		al.add(2);
		Collections.reverse(al);
		System.out.println(al);
	}
}

// [2, 5, 3, 1]

package interview_questions;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Adobe_election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr ={"AA", "AA","DD","DD","BB", "BB","CC","AA","CC","BB","EE","EE","EE","AA"};
		String highest= calculate_HighestVote(arr);
		System.out.println(highest);

	}

	private static String calculate_HighestVote(String[] Votes) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new TreeMap<String, Integer>();
	    for (int i=0; i<Votes.length ; i++) {
	      if (hm.containsKey(Votes[i])) {
	          int cont = hm.get(Votes[i]);
	          hm.put(Votes[i], cont + 1);
	       } else {
	           hm.put(Votes[i], 1);
	      }
        }

	    
	    hm.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue()) // ..reversed() 
        .limit(Votes.length) 
        .forEach(System.out::println);
        
        
	    String re_vote=null;
                  
        int maxValueInMap=(Collections.max(hm.values()));  // This will return max value in the Hashmap
        for (Entry<String, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                re_vote= entry.getKey();     // Print the key with max value
            }
        }
        
	  return re_vote;   
    }
}

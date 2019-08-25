package interview_questions;
import java.util.*;

public class secondMostRepeated {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int cases = Integer.valueOf(scan.nextLine());
		while(cases-->0){
			int size = Integer.valueOf(scan.nextLine());
			
			String[] ip = scan.nextLine().split(" ");
			
			System.out.println(secondMostRepeated(ip));
					 
		}
		
	}

	private static String secondMostRepeated(String[] ip) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
	    
		int size = ip.length;
	    int max_count=0;
	    String max_string = "";
	    
	    int i=0;
	    for(;i<size;i++)
	    {
	        Integer count= hm.get(ip[i]);
	        if(count==null) hm.put(ip[i],1);
	        else 
	        {
	            hm.put(ip[i],count+1);
	            if(max_count<count+1)
	            {
	            max_count = count+1;
	            max_string = ip[i];
	            }
	        }
	    }
	    i=0;
	    max_count=0;
	    String ans = "";
	    for(;i<size;i++)
	    {
	        if(!ip[i].equals(max_string) && hm.get(ip[i]) >max_count)
	        {
	            max_count = hm.get(ip[i]);
	            ans = ip[i];
	        }
	    }
	    return ans;
	}
}
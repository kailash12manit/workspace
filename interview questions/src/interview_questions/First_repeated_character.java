package interview_questions;
import java.util.*;

public class First_repeated_character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			String arr= sc.nextLine();
			System.out.println(repeatedChar(arr));
		}
	}
	public static String repeatedChar(String s){
		
		if(s==null || s.length()<=1) return "-1";
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int i=0;
	    for(;i<s.length();i++){
	    	Integer x= hm.get(s.charAt(i));
	    	if(x==null){
	    		hm.put(s.charAt(i), 1);
	    	}
	    	else{
	    		hm.put(s.charAt(i),x+1);
	    	}
	    }
	    i=0;
	    for( ; i<s.length();i++){
	    	Integer x=hm.get(s.charAt(i));
	    	if(x>1){
	    		return ""+s.charAt(i);
	    	}
	    }
	    return "-1";	
	}
}
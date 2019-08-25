package string;

import java.rmi.server.RemoteRef;
import java.util.Arrays;

public class String_03 {
	public static void main(String[] args) {
		//System.out.println(countYZ("fez day"));
		//System.out.println(withoutString("Hello there", "llo"));
		//System.out.println(equalIsNot("This is not"));
		//System.out.println(gHappy("xxggxx"));
		//System.out.println(countTriple("abcXXXabc"));
		//System.out.println(sumDigits("aa1bc2d3"));
		System.out.println(sameEnds("abXYab"));
		
	}
	
	public static String sameEnds(String str) {
		  if(str==null){
			  return "";
		  }
		  String front="";
		  String end="";
		  for(int i=str.length()/2;i>=0;i--){
			  front=str.substring(0,i);
			  end=str.substring(str.length()-i);
			  if(front.equals(end)){
				  break;
			  }		  
		  }
		  return front;		  
	}

	
	public static int sumDigits(String str) {
		int sum=0;  
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				sum+=Integer.parseInt(""+str.charAt(i));
			}
		}		
		return sum;
	}
	
	public static int countTriple(String str) {
		int count=0;
		for(int i=0;i<str.length()-2;i++){
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)){
				count++;
			}
		}
		return count;
	}
	
	
	public static boolean gHappy(String str) {
		  int len=str.length();
		  boolean happy=true;
		  
		  for(int i=0;i<len;i++){
			  if(str.charAt(i)=='g'){
				  if(i>0 && str.charAt(i-1)=='g'){
					  happy=true;
				  }
				  else if(i<len-1 && str.charAt(i+1)=='g'){
					  happy=true;
				  }
				  else{
					  happy=false;
				  }
			  }
			  
		  }
		  return happy;
	}
	
	
	public static boolean equalIsNot(String str) {
	    int is_count=0;
	    int not_count=0;
	    int len=str.length();
	    
	    for(int i=0;i<len;i++){
	    	if(i<len-2){
	    		String temp = str.substring(i,i+3);
	    		if(temp.equals("not")){
	    			not_count++;
	    		}
	    	}
	    	if(i<len-1){
	    		String temp = str.substring(i,i+2);
	    		if(temp.equals("is")){
	    			is_count++;
	    		}
	    	}    	
	    }
	    if(is_count==not_count){
	    	return true;
	    }
	    else{
	    	return false;
	    }
	}	    
	 
	public static String withoutString(String base, String remove) {
		  int index=0;
		  remove=remove.toLowerCase();
		  int remlen=remove.length();
		   
		  while(true){
			  index=base.toLowerCase().indexOf(remove);
			  if(index==-1){
				  break;
			  }
			  else{
				  base = base.substring(0,index)+base.substring(index+remlen);
			  }
		  }		  
		  return base;
    }
	
	public static int countYZ(String str) {
		  int count=0;
		  int len=str.length();
		  str=str.toLowerCase();
		  
		  for(int i=0;i<str.length();i++){
			  if(str.charAt(i)=='y' || str.charAt(i)=='z') {
				  if(i<len-1 && !Character.isLetter(str.charAt(i+1))) {
					  count++;
				  }
				  else if(i==len-1){
					  count++;
				  }
			  }
		  }
		  return count;
	}
}

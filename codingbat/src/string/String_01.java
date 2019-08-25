package string;

public class String_01 {
	public static void main(String[] args) {
		
		System.out.println(bobThere("abcbob"));
		System.out.println(xyBalance("aaxbby"));
		System.out.println(xyzThere("xyz.abc"));
		
		
	}
	
	public static boolean xyzThere(String str) {
	      if(str.length()>=3 && str.substring(0,3).equals("xyz")){
	        return true;
	      }
	      
	      for(int i=1;i< str.length()-2;i++){
	        if(str.charAt(i-1)!='.' && str.substring(i,i+3).equals("xyz")){
	          return true;
	        }
	      }
	      return false;
	}
	
	public static boolean xyBalance(String str) {
		  return true;
		
	}
	
	public static boolean bobThere(String str) {
		  if(str.length()<=2){
		    return false;
		  }
		  
		  for(int i=1;i<str.length()-1;i++){
		    
		    if(str.charAt(i-1)=='b' && str.charAt(i+1)=='b') {
		      return true;
		    }
		  }
		  return false;
		}

}

package interesting_facts_about_null_in_java;
/*
 * Unlike common misconception, null is not Object or neither a type.
 * It’s just a special value, which can be assigned to any reference type 
 * and you can type cast null to any type
 * 
 */

public class Typeofnull {
	public static void main(String[] args) {
	
		 // null can be assigned to String
	    String str = null; 
	    
	    // you can assign null to Integer also
	    Integer itr = null; 
	    
	    // null can also be assigned to Double
	    Double dbl = null; 
	        
	    // null can be type cast to String
	    String myStr = (String) null; 
	    
	    // it can also be type casted to Integer
	    Integer myItr = (Integer) null; 
	    
	    // yes it's possible, no error
	    Double myDbl = (Double) null; 
	    
	}
}
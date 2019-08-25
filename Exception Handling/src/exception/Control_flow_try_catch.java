package exception;

public class Control_flow_try_catch {
	 public static void main (String[] args)  
	    { 
	          
	        // array of size 4. 
	        int[] arr = new int[4]; 
	        try
	        { 
	            int i = arr[4]; 
	                  
	            // this statement will never execute 
	            // as exception is raised by above statement 
	            System.out.println("Inside try block"); 
	        } 
	        catch(ArrayIndexOutOfBoundsException ex) 
	        { 
	            System.out.println("Exception caught in Catch block"); 
	        } 
	          
	        // rest program will be excuted 
	        System.out.println("Outside try-catch clause"); 
	    }
}
/*
Exception occurs in try block and handled in catch block: If a statement in try block
raised an exception, then the rest of the try block doesn’t execute and control passes 
to the corresponding catch block. After executing catch block, the control will be 
transferred to finally block(if present) and then rest program will be executed.
*/
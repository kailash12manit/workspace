package exception;

/*
 * Exception occurred in try-block is not handled in catch block: In this case,
 *  default handling mechanism is followed. If finally block is present, it will be
 *   executed followed by default handling mechanism.
 */
public class try_catch_clause {
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
          
        // not a appropriate handler 
        catch(NullPointerException ex) 
        { 
            System.out.println("Exception has been caught"); 
        } 
          
        // rest program will not execute 
        System.out.println("Outside try-catch clause"); 
    } 

}


//Run Time Error:
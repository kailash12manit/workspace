// http://www.wikihow.com/Validate-an-IP-Address-in-Java

package strings_demo;

import java.util.Scanner;

public class Check_the_IP_address {

	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String ipAddress = s.nextLine();
        if( validateIPAddress(ipAddress)){
            System.out.println("YES");
        }
        else
         System.out.println("NO");
    }
    public static boolean validateIPAddress( String ipAddress )
    { 
     	String[] tokens = ipAddress.split("\\.");
 	    if (tokens.length!= 4)
 	    {	 return false; 
 	    } 
    	for (String str: tokens)
    	{	int i = Integer.parseInt(str); 
	    	if ((i < 0) || (i > 255)) 
		    {	 return false; 
		    }
	    }
     return true; 
    }
}

package g_fact;

/*
    Does Java support goto?
  
    Unlike C/C++, Java does not have goto statement, but java supports label. 
	The only place where a label is useful in Java is right before nested loop statements. 
	We can specify label name with break to break out a specific outer loop.
	Similarly, 	label name can be specified with continue.
 */
public class label {
	public static void main(String[] args) {
	outer: //label for outer loop
		for (int i = 0; i < 10; i++) { 
		     for (int j = 0; j < 10; j++) {
		       if (j == 4)
		       {
		    	   continue outer;
		       }
		       System.out.println("value of i = " + i);
		       System.out.println("value of j = " + j);
		      }
		 } //end of outer loop
	System.out.println("kk");
	} // end of main()
}

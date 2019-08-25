package interesting_facts_about_null_in_java;
/*
 * The java instanceof operator is used to test whether the object is an instance of
 * the specified type (class or subclass or interface). At run time, the result of the
 * instanceof operator is true if the value of the Expression is not null.
 */

public class instanceof_operator {
	public static void main(String[] args) {
		 Integer i = null;
         Integer j = 10;
         
       //prints false
         System.out.println(i instanceof Integer);
          
         //Compiles successfully
         System.out.println(j instanceof Integer);
                 		
	}
}

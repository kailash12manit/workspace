package interesting_facts_about_null_in_java;

/*
 * During auto-boxing and unboxing operations, compiler simply throws Nullpointer exception 
 * error if a null value is assigned to primitive boxed data type.
 */
public class Autoboxing_and_unboxing {
	
	public static void main(String[] args) {
		//An integer can be null, so this is fine
        Integer i = null;
         
        //Unboxing null to integer throws NullpointerException
        //int a = i;
		
	}

}

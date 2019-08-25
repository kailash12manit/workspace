package interesting_facts_about_null_in_java;
/*
 * We cannot call a non-static method on a reference variable with null value, 
 * it will throw NullPointerException, but we can call static method with reference 
 * variables with null values. Since static methods are bonded using static binding,
 * they won’t throw Null pointer Exception.
 */

public class Static_vs_Non_static_Methods {
	public static void main(String[] args) {
		
		Static_vs_Non_static_Methods obj= null;
        obj.staticMethod();
        obj.nonStaticMethod();
		
	}

	private void nonStaticMethod() {
		// TODO Auto-generated method stub
		//Can not be called by null reference
        System.out.print(" Non-static method- ");
        System.out.println("cannot be called by null reference");
        
	}

	private static void staticMethod() {
		// TODO Auto-generated method stub
		 System.out.println("static method, can be called by null reference");
	}
	

}

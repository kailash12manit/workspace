/**
 * 
 */
package strings_demo;

/**
 * @author kailash
 *
 */
public class Equals_deom {

	/**
	 * @param argsThis method compares this string to the specified object. 
	 * The result is true if and only if the argument is not null and is a String object 
	 * that represents the same sequence of characters as this object.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A= "ABCD";
		String A1=A;
		String B= "ABCD";
		String C= "ABDC";
		String D= new String("AB");
		String F= new String ("AB");
		String g= "abcd";
		System.out.println(A1.equals(A)); 
		System.out.println(D==F); // false
		System.out.println(A==g); // false
		System.out.println(D.equals(F));
		System.out.println(A.equals(B));
		System.out.println(g=="ABCD"); // false
		
	}
}

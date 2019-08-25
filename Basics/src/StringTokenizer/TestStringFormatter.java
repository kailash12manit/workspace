/**
 * 
 */
package StringTokenizer;

public class TestStringFormatter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to-capitalize-each-word-in-string
		
		String test_string1="my name is khan";
		String test_string2="i am kailash kumar prajapati";
		System.out.println("original string is :"+test_string1);
		System.out.println("original string is :"+test_string2);
		
		System.out.println("capital words test: "+StringFormatter.capitalizeWord(test_string1));
		System.out.println("capital words test: "+StringFormatter.capitalizeWord(test_string2));
		System.out.println("reverse of each words :"+StringFormatter.reverseWord(test_string1));
		System.out.println("reverseToggle:"+StringFormatter.reverseToggle("this is javatpoint"));
		
	}
}

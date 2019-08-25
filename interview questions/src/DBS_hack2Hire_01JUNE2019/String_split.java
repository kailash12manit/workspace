package DBS_hack2Hire_01JUNE2019;

public class String_split {
	public static void main(String[] args) {
		String test = "this is a test";
		String []tokens = test.split("\\s+");
		System.out.println(tokens.length);		
	}

}

/*
WITH : String []tokens = test.split("\s");
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
at DBS_hack2Hire_01JUNE2019.String_split.main(String_split.java:6)


curect is    test.test("\\s+");
 */


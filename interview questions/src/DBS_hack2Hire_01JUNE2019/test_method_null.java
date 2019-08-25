package DBS_hack2Hire_01JUNE2019;

public class test_method_null {
	public static void main(String[] args) {
		test(null);
	}
	
	public static void test(String str){
		if(str==null | str.length()==0){
			System.out.println("str is empty");
		}
		else{
			System.out.println("str is not empty");
		}		
	}
}

/*
Exception in thread "main" java.lang.NullPointerException
at DBS_hack2Hire_01JUNE2019.test_method_null.test(test_method_null.java:9)
at DBS_hack2Hire_01JUNE2019.test_method_null.main(test_method_null.java:5)
*/
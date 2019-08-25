package DBS_hack2Hire_01JUNE2019;

public class test1_agrs_related {
	public static void main(String[] args) {
		test1_agrs_related obj = new test1_agrs_related();
		obj.printvalue(args);
		
	}

	void printvalue(String[] arg) {
		// TODO Auto-generated method stub
		try{
			System.out.println(arg[0]+":"+arg[1]);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointerException");
		}
		catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("IndexOutOfBoundsException");
		}
		/*
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		*/
	}
}
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Unreachable catch block for ArrayIndexOutOfBoundsException. 
It is already handled by the catch block for IndexOutOfBoundsException

at DBS_hack2Hire_01JUNE2019.test1_agrs_related.printvalue(test1_agrs_related.java:23)
at DBS_hack2Hire_01JUNE2019.test1_agrs_related.main(test1_agrs_related.java:6)

*/

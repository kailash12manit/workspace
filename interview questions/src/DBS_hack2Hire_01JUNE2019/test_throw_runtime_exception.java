package DBS_hack2Hire_01JUNE2019;

public class test_throw_runtime_exception {
	
	static void test() throws RuntimeException {
		try{ 
			System.out.println("test");
			throw new RuntimeException();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
	}
	
	public static void main(String[] args) {
		try{
		test();
		}
		catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("RuntimeException");
		}
		System.out.println("end");
	}
}

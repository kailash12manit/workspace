package DBS_hack2Hire_01JUNE2019;

public class test_gc_divideByZero {
	public static void main(String[] args) throws InterruptedException {
		test_gc_divideByZero t = new test_gc_divideByZero();
		t=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("end main");
	}
	@Override
	protected void finalize(){
		// TODO Auto-generated method stub
		System.out.println("finalize method called");
		System.out.println(10/0);
	}
}
/*
finalize method called
[ take 1 second wait] then
end main


finalize method called
end main

*/ 

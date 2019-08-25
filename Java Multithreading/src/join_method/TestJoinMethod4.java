package join_method;

public class TestJoinMethod4 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()); //Example of currentThread() method
        System.out.println(Thread.currentThread().getPriority());
        
		
	}
	
	public static void main(String[] args) {
		
		TestJoinMethod4  T4= new TestJoinMethod4();
		TestJoinMethod4 T5 = new TestJoinMethod4();
		T4.setPriority(Thread.MIN_PRIORITY);
		T5.setPriority(Thread.MAX_PRIORITY);
		T4.start();
		T5.start();
		
		
	}
}

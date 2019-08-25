package join_method;

public class TestJoinMethod2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
				
		}	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestJoinMethod2 T1 = new TestJoinMethod2();
		TestJoinMethod2 T2 = new TestJoinMethod2();
		TestJoinMethod2 T3 = new TestJoinMethod2();
		
		
		T1.start();
		T1.join(1500); //when t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing.


		T2.start();
		T3.start();
			
	}
}

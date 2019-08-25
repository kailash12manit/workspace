package join_method;

public class TestJoinMethod1 extends Thread {

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
		
		TestJoinMethod1 T1 = new TestJoinMethod1();
		TestJoinMethod1 T2 = new TestJoinMethod1();
		TestJoinMethod1 T3 = new TestJoinMethod1();
		
		System.out.println("T1 name is : "+T1.getName());
		System.out.println("T1 name is : "+T2.getName());
	
		T1.setName("Kailash");
		
		System.out.println("after setname , T1 :"+T1.getName());
		
		
		T1.start();
		T1.join(); //when t1 completes its task then t2 and t3 starts executing.

		T2.start();
		T3.start();
			
	}
}

package Java_Multithreading;

public class TestCallRun1 extends Thread{

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
	 public static void main(String[] args) {
		
		 TestThreadTwice1 T= new TestThreadTwice1();
		 T.start();
		 T.start();
	}

}

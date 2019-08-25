package DBS_hack2Hire_01JUNE2019;

public class TestOne implements Runnable{
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new TestOne());
		t.start();
		System.out.print("started");
		t.join();
		System.out.print("completed");		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++){
			System.out.print(i);
		}		
	}
}
//started0123completed
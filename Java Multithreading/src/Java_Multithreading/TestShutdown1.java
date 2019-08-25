package Java_Multithreading;

class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("shut down hook task completed.."); 
	}
	
}
public class TestShutdown1 {
	
	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		
		r.addShutdownHook(new MyThread());
		
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		
		try { 
			Thread.sleep(3000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

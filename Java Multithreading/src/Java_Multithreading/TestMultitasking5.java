package Java_Multithreading;
//by annonymous class that implements Runnable interface

public class TestMultitasking5 {

	public static void main(String[] args) {
		
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("tesk 1");
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("tesk 2");
			}
		};
		
		Thread T1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		T1.start();
		t2.start();
		
	}
}

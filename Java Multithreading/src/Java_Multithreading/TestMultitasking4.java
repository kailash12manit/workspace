package Java_Multithreading;

//Program of performing two tasks by two threads

public class TestMultitasking4 {
	public static void main(String[] args) {
		
		Thread T1 = new Thread(){
			public void run() {
				System.out.println("task one");  
			}
		};
		
		Thread T2 = new Thread(){
			public void run() {
				System.out.println("task two");  
			}
		};
		
		T1.start();
		T2.start();
		
	}

}

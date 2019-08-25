package Java_Multithreading;

public class ThreadGroupDemo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		ThreadGroupDemo r = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(tg1,r,"one");
		t1.start();
		
		Thread t2 = new Thread(tg1,r,"two");
		t2.start();
		
		Thread t3 = new Thread(tg1,r,"three");
		t3.start();
		
		System.out.println("Thread Group Name: "+tg1.getName());  
        tg1.list();
		
	}

}

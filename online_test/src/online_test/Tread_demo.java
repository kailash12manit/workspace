
public class Tread_demo {
	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Thread.currentThread().getName());
		Thread th1 = new mythread();
		th1.setName("thread 1");
			
		
		Thread th2 = new mythread();
		th2.setName("thread 2");
		
		Thread th3 = new mythread();
		th3.setName("thread 3");
		
		Thread th4 = new mythread();
		th4.setName("thread 4");
		
		
		th1.start();
		th1.join();
		
		th2.start();
		th2.join();
		
		th3.start();
		th3.join();	
		th3.yield();
		th4.start();
		
	}
}

class mythread extends Thread{
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<10;i++) {
			if(i==5) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("main :"+Thread.currentThread().getName());
			
		}
		//System.out.println(Thread.currentThread().getName());
	}
}
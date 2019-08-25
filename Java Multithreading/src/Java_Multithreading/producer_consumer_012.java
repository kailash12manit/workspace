package Java_Multithreading;

class Q{
	int n;
	boolean valueSeet=false;
	
	synchronized int get(){
		while(!valueSeet){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("GOT:"+n);
		valueSeet=false;
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return n;
	}

	synchronized void put(int n){
		while(valueSeet){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		this.n=n;
		valueSeet=true;
		System.out.println("PUT:"+n);
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

class producer implements Runnable {
	Q q;
	producer(Q q){
		this.q=q;
		new Thread(this,"producer").start();
	}
	
	public void run(){
		int i=1;
		while(true){
			q.put(i++);
		}
	}
}

class consumer implements Runnable{
	Q q;
	consumer(Q q){
		this.q=q;
		new Thread(this,"consumer").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			q.get();
		}
	}
}

public class producer_consumer_012 {
	public static void main(String[] args) {
		Q q = new Q();
		new producer(q);
		new consumer(q);
		System.out.println("press control+C to stop");		
	}
}

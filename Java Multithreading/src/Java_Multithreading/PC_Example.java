/**
 * 
 */
package Java_Multithreading;

import java.util.LinkedList;

/**
 * @author kailash
 *
 */
public class PC_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		final PC pc = new PC();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		});	
		t2.start();
		
		t1.start();
		
		//t1.join();
		//t2.join();		
	}

}
class PC{
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
	int capacity = 3;
	
	// function called by producer thread.
	public void produce() throws InterruptedException {
		int value=0;
		while(true){
			synchronized (this) {
				// producer thread will wait while list id full
				while(ll.size()==capacity){
					wait();
				}
				System.out.println("\nproducer produced -> "+value);
				// insert the jobs in the list 
				ll.add(value++);
				
				// notify the consumer thread that it can start consuming
				notify();
				Thread.sleep(2000);		
				if(value==5){
					break;
				}
			}			
		}		
	}
	
	// function called by consumer thread
	public void consumer() throws InterruptedException{
		
		while(true){
			synchronized (this) {
				while(ll.size()==0){
					wait();
				}
				int val = ll.removeFirst();
				System.out.println("\nconsumer consumed -> "+val);
				notify();
				Thread.sleep(2000);
			}			
		}		
	}	
}
package join_method;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myThread2 extends Thread{
	
	private String name;
	public myThread2(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start Thread :"+name);
		try {
				Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ended Thread :"+name);
	}
}
public class Thread_Pool_concept_using_threads {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++){
		   Thread t1 = new myThread2("myWorkerThread:"+i);
		   executorService.execute(t1);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()){
			
		}
		System.out.println("All request completed");
		
	}
	

}

package join_method;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myThread implements Runnable{
	
	private String name;
	public myThread(String name){
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

public class Thread_Pool_concept {
	public static void main(String[] args) {
	
		ExecutorService executorService = Executors.newFixedThreadPool(2);	
		for(int i=0;i<10;i++){
			Runnable runnable = new myThread("myWorkerThread : "+i);
			executorService.execute(runnable);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()){
		}
		
		System.out.println("All request completed");
						
	}	
}
package callable_future_java;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallableExample implements Callable {
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int random_number = generator.nextInt(5);
		//System.out.println(random_number);
		Thread.sleep(random_number*1000);
		
		return random_number;
		
	}
}
public class CallableFutureTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		FutureTask[] randomNumberTasks = new FutureTask[5];
		for(int i=0;i<5;i++){
			
			Callable callable = new CallableExample();
			randomNumberTasks[i]=new FutureTask(callable);
			
			Thread t = new Thread(randomNumberTasks[i]);
			t.start();					
		}
		
		for (int i = 0; i < 5;i++) {
			
			System.out.println(randomNumberTasks[i].get());
		}
	}
	

}

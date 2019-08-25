package callable_future_java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumCalculator implements Callable<Integer>{

	int n;
	public SumCalculator(int n){
		this.n=n;
	}
	
	@Override
	public Integer call() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		try{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sum;
	}
}

class FactorialCalculator implements Callable<Integer> {
    int n;
	FactorialCalculator(int n){
		this.n=n;
	}
	
	@Override
	public Integer call(){
		int result=1;
		for(int i=1;i<=n;i++){
			result=result*i;
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}

public class CallableAndFutureExample {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Future<Integer> resultFact = executorService.submit(new FactorialCalculator(10));
		Future<Integer> resultsum = executorService.submit(new SumCalculator(1000));
				
		System.out.println("kk");
		
		try {
			Integer sumValue;
			sumValue = resultsum.get();
			System.out.println("SUM : "+sumValue);
			
			Integer FactValue ;
			FactValue=resultFact.get();
			System.out.println("Fact:"+FactValue);
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();		
	}

}

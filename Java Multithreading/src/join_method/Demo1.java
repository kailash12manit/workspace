package join_method;

public class Demo1 {
	
	private static int count = 0;
	
	public static synchronized void increment(){
		count++;
	}
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<100;i++){
					increment();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<100;i++){
					increment();
				}
			}
		});
				
		t1.start();
		t2.start();
		
	    t1.join();
	    t2.join();
		
		System.out.println("count:"+count);
				
	}
	
	
	
	

}

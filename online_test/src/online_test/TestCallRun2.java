
public class TestCallRun2 extends Thread{  
	public void run(){  
		for(int i=1;i<5;i++){  
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}  
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		TestCallRun2 t1=new TestCallRun2();  
		TestCallRun2 t2=new TestCallRun2(); 
		
		System.out.println("now with run()");
		t1.run();
		t2.run();
		System.out.println("now with start()");
		t1.start();  
		t2.start();  
	}  
} 


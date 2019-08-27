
public class TestJoinMethod1 extends Thread{  
	public void run(){  
		for(int i=1;i<=10;i++){  
			try{  
				Thread.sleep(100);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i+" thread name: "+Thread.currentThread().getName());  
		}  
	}  
	public static void main(String args[]){  
		TestJoinMethod1 t1=new TestJoinMethod1();  
		TestJoinMethod1 t2=new TestJoinMethod1();  
		TestJoinMethod1 t3=new TestJoinMethod1();  
		t1.setName("ONE");
		t2.setName("TWO");
		t3.setName("THREE");
		
		t1.start();  
		try{  
			System.out.println("join is called");
			t1.join();  
		}catch(Exception e){System.out.println(e);}  
		
		System.out.println("now without join is called");
		t2.start();  
		t3.start();  
	}  
}  

public class theadmethodi implements Runnable{
	static int n=10;
	public static void m1() {
		//System.out.println("m1 called ");
		for(int i=0;i<100;i++) {
			n++;
		}
	}	
	public static void m2() {
		//System.out.println("m2 called ");
		for(int i=0;i<100;i++) {
			n++;
		}
	}	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("run called ");
		
		
		m1();
		m2();
		System.out.println(n);
		
	}
	public static void main(String[] args) throws InterruptedException {
		theadmethodi obj = new theadmethodi();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.start();		
		t1.sleep(10);
		
		t2.start();
		//t2.join();
		System.out.println(n);
	}
}

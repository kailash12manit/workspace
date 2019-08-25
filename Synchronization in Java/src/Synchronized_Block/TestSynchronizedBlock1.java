package Synchronized_Block;

class Table{
	
	public void printTable(int n){
		
		synchronized (this) {
		for(int i=1;i<5;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e);

			}
		}
  	    }// sync
	}
}
class myThread1 extends Thread{
	Table t;
	public myThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(5);
	}
}

class myThread2 extends Thread{
	
	Table t;
	public myThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(100);
	}
}

public class TestSynchronizedBlock1 {

	public static void main(String[] args) {
		
		Table obj = new Table();
		myThread1  t1 = new myThread1(obj);
		myThread2  t2 = new myThread2(obj);
		
		t1.start();
		t2.start();
		
		
		
	}

}

package Static_synchronization;

class Table{
	synchronized static void printTable(int n){
		for(int i=1;i<5;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	 }
}
class myThead1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	Table.printTable(1);
	}
} 
class myThead2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	Table.printTable(10);
	}
}
class myThead3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	Table.printTable(100);
	}
}
class myThead4 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	Table.printTable(1000);
	}
}
public class TestSynchronization4 {
	
	public static void main(String[] args) {
		
		myThead1 mt1 = new myThead1();
		myThead2 mt2 = new myThead2();
		myThead3 mt3 = new myThead3();
		myThead4 mt4 = new myThead4();
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}
}
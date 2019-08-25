package synchronized_method;

class Table2{
	
	public synchronized void printTable(int n){
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

public class TestSynchronization3 {
	
	public static void main(String[] args) {
		
		final Table2 obj= new Table2();
		
		Thread t1= new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.printTable(5);
			}
		};
		
		Thread t2 = new Thread(){
		    @Override
			public void run() {
		    	obj.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}
}

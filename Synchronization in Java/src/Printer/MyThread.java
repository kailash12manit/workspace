package Printer;

public class MyThread implements Runnable{

	Printer P;
	String msg;
	Thread th;
	
	public MyThread(String s, Printer P ) {
		// TODO Auto-generated constructor stub
		this.P = P;
		msg=s;
		
		th= new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(P){
			P.print(msg);
		}
	}
	
	

}

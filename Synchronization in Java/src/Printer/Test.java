package Printer;

public class Test {
	
	public static void main(String[] args) {
		Printer obj = new Printer();
		MyThread M1 = new MyThread("Welcome", obj);
		MyThread M2 = new MyThread("To", obj);
		MyThread M3 = new MyThread("Java", obj);
		
		try{
			M1.th.join();
			M2.th.join();
			M3.th.join();	
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main interrupted");
			
		}	
	}
}
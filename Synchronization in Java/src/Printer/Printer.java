package Printer;

public class Printer {
	
	public void print(String str){
		System.out.print("[ "+str);
		try{
			Thread.sleep(1000);			
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread Interrupted");
		}
		System.out.println(" ]");
	}
}
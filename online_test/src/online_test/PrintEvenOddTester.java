
public class PrintEvenOddTester {
	public static void main(String[] args) {
		
		printer pr = new printer();
		
		Thread th1 = new Thread(new TaskEvenOdd(10, pr, false));
		Thread th2 = new Thread(new TaskEvenOdd(10, pr, true));
		th1.start();
		th2.start();
		
	}
}

class TaskEvenOdd implements Runnable {

	int max;
	printer pr;
	boolean isevennumber;
	
	public TaskEvenOdd(int max, printer pr, boolean isevennumber) {
		this.max = max;
		this.pr = pr;
		this.isevennumber = isevennumber;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int number = isevennumber ? 2:1;
		while(number <= max) {
			if(isevennumber) {
				pr.printEven(number);
			}
			else {
				pr.printOdd(number);
			}
			number+=2;			
		}	
	}	
}

class printer {
	boolean isodd=false;
	public synchronized void printEven(int number) {
		while(isodd==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Even:"+number);
		isodd=false;
		notifyAll();		
	}

	public synchronized void printOdd(int number){
		while(isodd==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd :"+number);
		isodd=true;
		notifyAll();		
	}	
}

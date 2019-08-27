


class print{
	public static void printValue() {
		System.out.println("Hi"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hi"+Thread.currentThread().getName());	
	}	
}

public class Thread_demo4 {
	public static void main(String[] args) {
				
	}
}

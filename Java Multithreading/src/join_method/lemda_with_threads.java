package join_method;

/*
class Hi implements Runnable {
	public void run(){
				for(int i=0;i<5;i++){
					System.out.println("Hi");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}		
			}
}

class Hello implements Runnable {
	public void run(){
				for(int i=0;i<5;i++){
					System.out.println("Hello");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}		
			}
}

*/
public class lemda_with_threads {
	public static void main(String[] args) {
		
		Runnable obj1 = () ->{
				for(int i=0;i<5;i++){
					System.out.println("Hi");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}		
			};
			
		Runnable obj2 = ()->{
				for(int i=0;i<5;i++){
					System.out.println("Hello");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}		
			};
	    
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
	    try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}	
}

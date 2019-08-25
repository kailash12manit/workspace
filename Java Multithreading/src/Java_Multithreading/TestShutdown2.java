package Java_Multithreading;

public class TestShutdown2 { //Shutdown Hook by annonymous class
	
	public static void main(String[] args) {
		
		Runtime r =  Runtime.getRuntime();
		r.addShutdownHook(new Thread(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
     		System.out.println("shut down hook task completed..");  
		}
			
		});
		
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try{
			Thread.sleep(3000);
		}catch (Exception e) {
			
		}  

	}
}